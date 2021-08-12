package vn.codegym.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import vn.codegym.springsecurity.model.service.UserDetailsServiceImpl;


@Configuration
@EnableWebSecurity
public class WenSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .formLogin()
//                .defaultSuccessUrl("/testLoginPage").permitAll()
//                .and()
//                .authorizeRequests().anyRequest().authenticated();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers( "/", "/hello").permitAll();

        http.authorizeRequests().antMatchers("/roleUser").access("hasAnyRole('USER', 'ADMIN')");

        http.authorizeRequests().antMatchers("/roleAdmin").access("hasRole('ADMIN')");

        http.authorizeRequests().and().formLogin()
                .defaultSuccessUrl("/admin");
    }
}
