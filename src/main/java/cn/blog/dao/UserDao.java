package cn.blog.dao;

import cn.blog.Domin.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {

    /**
     * @Description: 更改用户信息
     */
    int updateUserInfo(UserDomain user);

    /**
     * @Description: 根据主键编号获取用户信息
     */
    UserDomain getUserInfoById(@Param("uid") Integer uId);

    /**
     * 根据用户名和密码获取用户信息
     */
    UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);

}
