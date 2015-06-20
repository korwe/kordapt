package com.korwe.kordapt.acl;

import com.google.common.base.Objects;
import org.springframework.security.core.GrantedAuthority;

public class TreeAuthority implements GrantedAuthority {

    private final String role;
    private final String serviceGroup;

    public TreeAuthority(String serviceGroup, String role) {
        this.serviceGroup = serviceGroup;
        this.role = role;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    @Override public String getAuthority() {
        return role;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TreeAuthority that = (TreeAuthority) o;

        if (!role.equals(that.role)) return false;
        return serviceGroup.equals(that.serviceGroup);

    }

    @Override public int hashCode() {
        int result = role.hashCode();
        result = 31 * result + serviceGroup.hashCode();
        return result;
    }

    @Override public String toString() {
        return Objects.toStringHelper(this)
                      .add("role", role)
                      .add("serviceGroup", serviceGroup)
                      .toString();
    }
}
