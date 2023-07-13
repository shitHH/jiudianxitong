package com.hotel.service.impl;

import com.hotel.bean.User;
import com.hotel.dao.IUserDao;
import com.hotel.service.IUserService;
import com.hotel.util.SqlSessionUtil;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author xu
 * user实现类
 */
public class IUserServiceImpl implements IUserService {
    IUserDao userDao= SqlSessionUtil.getsession().getMapper(IUserDao.class);

    /**
     * 通过电话和密码返回对象
     * @param tel
     * @param pass
     * @return
     */
    @Override
    public User selectUser(String tel, String pass) {
        User user=userDao.selectUser(tel, pass);
        return user;
    }

    @Override
    public Boolean add(User user) {
        int i= userDao.add(user);
        if (i!=1){
            return false;
        }
        return true;
    }

    @Override
    public Boolean findTel(String tel) {
        if(userDao.findTel(tel)!=null){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Boolean findIdNum(String idNum) {
        if(userDao.findIdNum(idNum)!=null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public User findUser(String num) {
        User user =userDao.findIdNum(num);
        return user;
    }

    @Override
    public boolean updatePass(String pass, String idNum) {
        int i= userDao.updatePass(pass,idNum);
        if (i!=1){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public User findId(int id) {
        return userDao.findId(id);
    }

}
