package com.dottydingo.hyperion.jpa.persistence;

import com.dottydingo.hyperion.api.BaseAuditableApiObject;

/**
 */
public class SampleApiObject extends BaseAuditableApiObject<Long>
{
    private String name;
    private Integer age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }
}
