package com.coursestopics.springboot.service;
import com.coursestopics.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

       private UserRepository repository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.repository=userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        return user;

    }

}