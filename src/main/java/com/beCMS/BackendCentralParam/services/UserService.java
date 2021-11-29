package com.beCMS.BackendCentralParam.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

import com.beCMS.BackendCentralParam.model.userlogin.User;

public interface UserService extends UserDetailsService {

    User findBynip(String nip);



    Optional<User> findById(Long id);


   
}
