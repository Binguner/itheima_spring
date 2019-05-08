package com.itheima.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        // 调用 userDao 中的 save 方法
        this.userDao.save();
        System.out.println("userservice... save ...");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
