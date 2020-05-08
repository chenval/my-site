package cn.blog.service;

import cn.blog.Domin.UserDomain;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    int updateUserInfo(UserDomain user);

    /**
     *
     * 根据主键编号获取用户信息
     */
    UserDomain getUserInfoById(Integer uId);

    UserDomain login(String username, String password);

}
