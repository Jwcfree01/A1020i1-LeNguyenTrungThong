package vn.codegym.casestudy.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.casestudy.model.UserDetails.MyUserDetail;
import vn.codegym.casestudy.model.bean.User;
import vn.codegym.casestudy.model.repository.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByName(username);

        if(user == null){
            throw new UsernameNotFoundException("user name not found: "+username);
        }

        return new MyUserDetail(user);
    }
}
