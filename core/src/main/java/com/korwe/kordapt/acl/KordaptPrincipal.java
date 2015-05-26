package com.korwe.kordapt.acl;

import java.security.Principal;

/**
 * Created by tjad on 2015/05/26.
 */
public class KordaptPrincipal implements Principal{
    private Object id;
    private String name;

    public KordaptPrincipal(Object id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
