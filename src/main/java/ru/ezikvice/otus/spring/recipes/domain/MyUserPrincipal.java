package ru.ezikvice.otus.spring.recipes.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MyUserPrincipal implements UserDetails {
    private Client user;

    public MyUserPrincipal(Client user) {
        this.user = user;
    }

    // TODO: get real authorities
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    // TODO: real check
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    // TODO: real check
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // TODO: real check
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // TODO: real check
    @Override
    public boolean isEnabled() {
        return true;
    }
}