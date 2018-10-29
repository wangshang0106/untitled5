package cn.dao;

import cn.cn.pojo.UserInfo;

import java.util.List;

public interface UsersDao {
    /**
     * 根据用户信息查询用户
     * @param User 用户对象
     * @return 用户对象
     */
    List<UserInfo> selectUser(UserInfo User);
}
