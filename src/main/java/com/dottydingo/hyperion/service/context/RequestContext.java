package com.dottydingo.hyperion.service.context;

import com.dottydingo.hyperion.service.configuration.ApiVersionPlugin;
import com.dottydingo.hyperion.service.configuration.EntityPlugin;
import com.dottydingo.hyperion.service.endpoint.HttpMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.UriInfo;
import java.util.Set;

/**
 *  Request Context
 */
public class RequestContext
{
    private UriInfo uriInfo;
    private String entity;
    private Set<String> requestedFields;
    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
    private EntityPlugin entityPlugin;
    private ApiVersionPlugin apiVersionPlugin;
    private HttpMethod httpMethod;
    private UserContext userContext;
    private WriteContext writeContext;

    public UriInfo getUriInfo()
    {
        return uriInfo;
    }

    public void setUriInfo(UriInfo uriInfo)
    {
        this.uriInfo = uriInfo;
    }

    public String getEntity()
    {
        return entity;
    }

    public void setEntity(String entity)
    {
        this.entity = entity;
    }

    public Set<String> getRequestedFields()
    {
        return requestedFields;
    }

    public void setRequestedFields(Set<String> requestedFields)
    {
        this.requestedFields = requestedFields;
    }

    public HttpServletRequest getHttpServletRequest()
    {
        return httpServletRequest;
    }

    public void setHttpServletRequest(HttpServletRequest httpServletRequest)
    {
        this.httpServletRequest = httpServletRequest;
    }

    public HttpServletResponse getHttpServletResponse()
    {
        return httpServletResponse;
    }

    public void setHttpServletResponse(HttpServletResponse httpServletResponse)
    {
        this.httpServletResponse = httpServletResponse;
    }

    public EntityPlugin getEntityPlugin()
    {
        return entityPlugin;
    }

    public void setEntityPlugin(EntityPlugin entityPlugin)
    {
        this.entityPlugin = entityPlugin;
    }

    public ApiVersionPlugin getApiVersionPlugin()
    {
        return apiVersionPlugin;
    }

    public void setApiVersionPlugin(ApiVersionPlugin apiVersionPlugin)
    {
        this.apiVersionPlugin = apiVersionPlugin;
    }

    public HttpMethod getHttpMethod()
    {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod)
    {
        this.httpMethod = httpMethod;
    }

    public UserContext getUserContext()
    {
        return userContext;
    }

    public void setUserContext(UserContext userContext)
    {
        this.userContext = userContext;
    }

    public WriteContext getWriteContext()
    {
        return writeContext;
    }

    public void setWriteContext(WriteContext writeContext)
    {
        this.writeContext = writeContext;
    }
}
