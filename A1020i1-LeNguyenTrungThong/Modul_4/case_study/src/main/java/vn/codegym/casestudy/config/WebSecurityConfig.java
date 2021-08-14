//package vn.codegym.casestudy.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import vn.codegym.casestudy.model.service.Impl.MyUserDetailServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private MyUserDetailServiceImpl myUserDetailService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .formLogin()
//                /*Login thanh cong se chuyen huong ve URL man hinh hien tai,
//                neu truy cap truc tiep /login thi login thanh cong se chuyen huong ve /student */
//                .defaultSuccessUrl("/customer/list").permitAll()
//
//                .and()
//                    /* antMatchers(...).permitAll() Cai dat URL pattern khong can xac thuc */
//                    .authorizeRequests().antMatchers("/notAccess").permitAll()
//
//                    /* hasRole() cài đặt quyền cho URL pattern tương ứng. */
//                    .antMatchers("/student/create").hasRole("ADMIN")
//                    .antMatchers("/notAccess").hasAnyRole("ADMIN", "USER") /* hasAnyRole cho phep cài dặt nhiều Role*/
////                    .antMatchers("/student").hasRole("USER")
////                    .antMatchers("/student").access("hasRole('USER')")
//
//                    /* tất cả request ngoài những URL pattern trên sẽ bắt buộc xác thực - login */
//                    .anyRequest().authenticated();
//    }
//}
