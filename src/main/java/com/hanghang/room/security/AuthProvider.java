package com.hanghang.room.security;

import com.hanghang.room.bin.User;
import com.hanghang.room.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * 自定义认证实现
 */
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private IUserService userService;
    //MD5加密器
    private final Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //获得输入的用户，及密码
        String userName = authentication.getName();
        String inputPassword = (String) authentication.getCredentials();

        User user = userService.getUserByName(userName);
        if (user == null) {
            //用户不存在
            throw new AuthenticationCredentialsNotFoundException("authError");
        }
        //用户的密码，用户的输入密码，加延
        if (this.passwordEncoder.isPasswordValid(user.getPassword(), inputPassword, user.getId())) {
            /**
             * 通过：返回
             * 参数：认证用户，密码，认证权限
             */
            System.out.println(user.getPassword()+"\t"+inputPassword+"\t"+user.getId());
            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        }

        throw new BadCredentialsException("authError");

    }

    /**
     * 注意：一定要改为true返回值，否则会出现未知错误
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
