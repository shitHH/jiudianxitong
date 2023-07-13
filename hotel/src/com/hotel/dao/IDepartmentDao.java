
package com.hotel.dao;

import com.hotel.bean.Department;

import java.util.List;

/**
 * @author  zyz
 * 部门数据访问接口
 */
public interface IDepartmentDao {
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
     * 返回受影响行数
     */
    public int addDpt(Department dpt);

    /**
     * 更新部门
     * @param dpt
     * 返回受影响行数
     */
    public int  updateDpt(Department dpt);

    /**
     * 根据部门编号删除对应部门
     * @param id
     * @return 返回受影响行数
     */
    public int deleteDpt(int id);

    public List<Department> querylist(String name);

}
