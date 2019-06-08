package com.hanghang.room.service;

import com.hanghang.room.bin.User;
import org.springframework.stereotype.Service;

/**
 * 用户服务业务接口
 */

public interface IUserService {
    User getUserByName(String name);
}
