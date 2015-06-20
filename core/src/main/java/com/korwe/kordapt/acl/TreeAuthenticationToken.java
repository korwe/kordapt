package com.korwe.kordapt.acl;

import com.google.common.collect.Lists;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.security.Principal;
import java.util.List;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class TreeAuthenticationToken implements Authentication{

    private List<GrantedAuthority> authorities;
    private Object principal;
    private TreeCredentials credentials;
    private Boolean isAuthenticated;

    public TreeAuthenticationToken(Authentication authentication){
        this.authorities = Lists.newArrayList(authentication.getAuthorities());
        this.principal = authentication.getPrincipal();
        if(TreeCredentials.class.isAssignableFrom(authentication.getCredentials().getClass())){
            this.credentials = (TreeCredentials)authentication.getCredentials();
        }
    }

    public TreeAuthenticationToken(Object principal, TreeCredentials credentials, List<GrantedAuthority> authorities){
        this.principal = principal;
        this.credentials = credentials;
        this.authorities = authorities;
    }

    public TreeCredentials getCredentials() {
        return credentials;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    public Object getPrincipal() {
        return principal;
    }

    @Override
    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        this.isAuthenticated = isAuthenticated;
    }

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getName() {
        if(Principal.class.isAssignableFrom(principal.getClass())){
            return ((Principal)principal).getName();
        }
        return (this.getPrincipal() == null) ? "" : this.getPrincipal().toString();
    }
}
