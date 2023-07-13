
package com.hotel.dao;

import com.hotel.bean.Employees;

import java.util.List;

/**
 * @author zyz
 * @create 2021-03-10 12:14
 * 员工数据访问接口
 **/
public interface IEmployeesDao {
    /**
     * 查询所有
     * @return list
     */
    public List<Employees> selectAll();

    /**
     * 根据员工编号查询员工对象
     * @param eId
     * @return 员工对象
     */
    public Employees selectOne(int eId);

    /**
     * 添加员工
     * @param emp
     * 返回受影响行数
     */
    public int addEmp(Employees emp);

    /**
     * 根据员工编号更新对应员工
     * @param emp
     * 返回受影响行数
     */
    public int  updateEmp(Employees emp);

    /**
     * 根据员工编号删除对应员工
     * @param id
     * @return 返回受影响行数
     */
    public int deleteEmp(int id);
    /**
     * 根据用户名，查询该用户名是否已经存在
     * @param name 用户名
     * @return 用户对象
     */
    public Employees find(String name);

}
