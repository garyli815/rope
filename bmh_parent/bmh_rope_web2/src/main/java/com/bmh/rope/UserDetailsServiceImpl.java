package com.bmh.rope;


import com.bmh.pojo.Users;

import com.bmh.rope.service.SystemUsersService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {


    private SystemUsersService systemUsersService;

    public void setSystemUsersService(SystemUsersService systemUsersService) {
        this.systemUsersService = systemUsersService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users systemUsers = systemUsersService.findByUserName(username);
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new User(username,systemUsers.getPassword(),list );
    }
}
