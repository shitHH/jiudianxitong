
package com.hotel.dao;

import com.hotel.bean.Clientinfo;
import com.hotel.bean.Employees;

import java.util.List;

/**
 * @author lk
 *客户数据访问接口
 **/
public interface IClientinfoDao {
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
     * 添加客户
     * @param cin
     */
    public int addCin(Clientinfo cin);

    /**
     * 更新客户
     * @param cin
     */
    public int  updateCin(Clientinfo cin);

    /**
     * 删除客户
     * @param cId
     */
    public int deleteCin(int cId);
    /**
     * 动态SQL
     * @param clientinfo
     * @return
     */
    public List<Clientinfo> queryChoose(Clientinfo clientinfo);

    /**
     * 使用Trim
     * @param clientinfo
     * @return
     */
    public List<Clientinfo> queryByTrim(Clientinfo clientinfo);
}
