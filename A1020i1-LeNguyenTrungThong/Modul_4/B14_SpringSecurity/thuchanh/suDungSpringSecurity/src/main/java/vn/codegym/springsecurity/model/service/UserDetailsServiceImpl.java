package vn.codegym.springsecurity.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.springsecurity.config.MyUserDetails;
import vn.codegym.springsecurity.model.Entity.User;
import vn.codegym.springsecurity.model.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (User) this.userRepo.findByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("user not found");
        }

        return new MyUserDetails(user);
    }
}
