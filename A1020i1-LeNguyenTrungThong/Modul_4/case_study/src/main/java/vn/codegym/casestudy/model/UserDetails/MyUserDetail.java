//package vn.codegym.casestudy.model.UserDetails;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import vn.codegym.casestudy.model.bean.Role;
//import vn.codegym.casestudy.model.bean.User;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class MyUserDetail implements UserDetails {
//
//    private User user;
//
//    public MyUserDetail(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        for(Role role: user.getRoleSet()){
//            System.out.println(role.getRoleName());
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//        }
//        return grantedAuthorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
////        return user.isEnabled();
//        return true;
//    }
//
//}
