package com.hanghang.room.service.user;

import com.hanghang.room.bin.Role;
import com.hanghang.room.bin.User;
import com.hanghang.room.mapper.RoleMapper;
import com.hanghang.room.mapper.UserMapper;
import com.hanghang.room.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的业务逻辑代码实现区
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User getUserByName(String name) {
        User user = userMapper.getUserByName(name);
        //System.out.println(user);
        if (user == null) {
            return null;
        }
        //获取权限
        List<Role> roles = roleMapper.findRolesByUserId(user.getId());
        //System.out.println(roles);
        if (roles == null || roles.isEmpty()) {
            throw new DisabledException("权限非法");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        user.setAuthorityList(authorities);
        return user;
    }
}
