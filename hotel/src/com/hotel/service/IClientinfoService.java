package com.hotel.service;

import com.hotel.bean.Clientinfo;

import java.util.List;
/**
 * @author lk
 *客户业务逻辑接口
 **/
public interface IClientinfoService {
    /**
     * 查询所有客户信息
     * @return
     */
    public List<Clientinfo> selectAll();

    /**
     * 根据客户id查询客户
     * @param cId
     * @return 客户对象
     */
    public Clientinfo selectOne(int cId);
    /**
     * 根据客户名字查询客户
     * @param name
     * @return 客户对象
     */
    public Clientinfo selectByname(String name);
    /**
     * 根据客户身份证号查询客户
     * @param idNumber
     * @return 客户对象
     */
    public Clientinfo selectByidNumber(String idNumber);
    /**
     * 更新客户信息
     * @param cin
     * @return 是否成功
     */
    public boolean  updateCin(Clientinfo cin);
    /**
     * 删除客户
     * @param cId
     * @return 是否成功
     */
    public boolean deleteCin(int cId);
    /**
     * 添加客户
     * @param cin
     */
    public boolean addCin(Clientinfo cin);
}
