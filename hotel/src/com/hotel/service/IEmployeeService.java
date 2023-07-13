
package com.hotel.service;
/**
 * @author zyz
 * @create 2021-03-11 10:29
 * 员工业务逻辑接口
 **/
import com.hotel.bean.Employees;

import java.util.Date;
import java.util.List;

public interface IEmployeeService {
    /**
     * 查询出来所有的员工集合，
     * @return
     */
    public List<Employees> selectAll();

    /**
     * 通过Id查询出该人的信息
     * @param eId 人员编号
     * @return 人员对象
     */
    public Employees selectOne(int eId);
    /**
     * 添加员工
     * @param emp
     * 返回受影响行数
     */
    public boolean addEmp(Employees emp);

    /**
     * 根据人员id删除用户
     * @param id 人员的编号
     * @return 是否成功
     */
    public boolean delete(int id);

    /**
     * 更新员工信息
     * @return 是否成功
     */
    public boolean update(Employees employees);

    /**
     * 根据员工名，查询该用户名是否已经存在
     * @return 是否可用
     */
    public Employees  find(String name);
}
