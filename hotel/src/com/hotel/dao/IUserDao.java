/**
 * @author zyz
 * @create 2021-03-10 12:10
 **/
package com.hotel.dao;

import com.hotel.bean.User;

import java.util.List;

/**
 * @author xu
 * 用户访问接口
 */
public interface IUserDao {

    /**
     * 查询所有用户的信息 不能看密码
     * @return 所有人员对象
     */
    List<User> selectAllUser();
    /**
     * 通过对象电话密码查找对象
     * @return 对象
     */
    User selectUser(String tel,String pass);
    /**
     * 更新用户信息
     * @param user 人员对象
     * @return 受影响的行数
     */
    public int add(User user);
    /**
     * 通过Id查询出该人的信息
     * @param id 人员编号
     * @return 人员对象
     */
    public User findId(int id);
    /**
     * 根据用户名，查询该用户名是否已经存在
     * @param name 用户名
     * @return 用户对象
     */
    public User findName(String name);
    /**
     * 根据用户的ID删除对应的用户
     * @param id 用户ID
     * @return 受影响的行数
     */
    public int deleteId(int id);
    /**
     * 根据身份证号删除对应的用户
     * @param idnum 用户身份证号
     * @return 受影响的行数
     */
    public int deleteIdNum(String idnum);

    /**
     * 通过tel查找对象
     * @param tel
     * @return
     */
    public User findTel(String tel);

    /**
     * 通过身份证号查找用户
     * @param idnum
     * @return
     */
    public User findIdNum(String idnum);

    public int updatePass(String pass,String idNum);
    public User findUId(int uid);
}
