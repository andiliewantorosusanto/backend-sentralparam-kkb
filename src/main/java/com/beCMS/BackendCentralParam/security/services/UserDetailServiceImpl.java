package com.beCMS.BackendCentralParam.security.services;

import java.util.Collection;
import java.util.stream.Collectors;

import com.beCMS.BackendCentralParam.model.userlogin.Role;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nip) throws UsernameNotFoundException {
        User currentUser = userRepository.findBynip(nip);
        System.out.println("current user : " + currentUser);
        /* UserDetails user = new org.springframework.security.core.userdetails.User(nip, currentUser.getPassword(),
                true, true, true, true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
        System.out.println("user : " + user);
        return user; */

        return new org.springframework.security.core.userdetails.User(currentUser.getnip(), currentUser.getPassword(),
                mapRolesToAuthorities(currentUser.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

}