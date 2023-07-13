package com.hotel.service;

import com.hotel.bean.User;

/**
 * @author xu
 * user业务逻辑接口
 */
public interface IUserService {

    /**
     * 查找业务逻辑对象
     * @param tel
     * @param pass
     * @return
     */
    public User selectUser(String tel, String pass);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Boolean add(User user);

    /**
     * 通过电话查找是否有此用户
     * @param
     * @return
     */
    public Boolean findTel(String tel);

    /**
     * 通过身份证号查找是否有此用户
     * @param num
     * @return
     */
    public Boolean findIdNum(String num);

    /**
     * 通过身份证号返回user
     * @param num
     * @return
     */
    public User findUser(String num);

    /**
     * 通过身份证号修改密码
     * @param pass
     * @param idNum
     * @return
     */
    public boolean updatePass(String pass,String idNum);
    /**
     * 通过Id查询出该人的信息
     * @param id 人员编号
     * @return 人员对象
     */
    public User findId(int id);
}
