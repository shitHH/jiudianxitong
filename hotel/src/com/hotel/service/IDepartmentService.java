
package com.hotel.service;

import com.hotel.bean.Department;

import java.util.List;

/**
 * @author zyz
 * @create 2021-03-11 14:40
 * 部门业务逻辑接口
 **/
public interface IDepartmentService {
    /**
     * 查询所有部门
     * @return
     */
    public List<Department> selectAll();

    /**
     * 根据部门编号查询部门
     * @param dId
     * @return
     */
    public Department selectOne(int dId);

    /**
     * 添加部门
     * @param dpt
     */
    public boolean addDpt(Department dpt);

    /**
     * 更新部门
     * @param dpt
     */
    public boolean  updateDpt(Department dpt);

    /**
     * 删除部门
     * @param id
     */
    public boolean deleteDpt(int id);
}
