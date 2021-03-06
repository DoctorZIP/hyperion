package com.dottydingo.hyperion.jpa.persistence.query;

import com.dottydingo.hyperion.core.persistence.PersistenceContext;
import com.dottydingo.hyperion.core.persistence.query.PersistentQueryBuilderFactory;
import cz.jirutka.rsql.parser.ast.Node;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Map;

/**
 */
public class JpaPersistentQueryBuilderFactory implements PersistentQueryBuilderFactory<JpaPersistentQueryBuilder>
{

    @Override
    public JpaPersistentQueryBuilder createQueryBuilder(Node rootExpression, PersistenceContext persistenceContext)
    {
        return new InternalPredicateBuilder(persistenceContext,rootExpression);
    }

    private class InternalPredicateBuilder<P> implements JpaPersistentQueryBuilder<P>
    {
        private PersistenceContext context;
        private Node rootExpression;

        private InternalPredicateBuilder(PersistenceContext context, Node rootExpression)
        {
            this.context = context;
            this.rootExpression = rootExpression;
        }

        @Override
        public Predicate buildPredicate(Root<P> root, CriteriaQuery<?> query, CriteriaBuilder cb)
        {
            return rootExpression.accept(new RsqlVisitor(context, root,query, cb,
                    context.getApiVersionPlugin().getQueryBuilders()));
        }
    }
}
