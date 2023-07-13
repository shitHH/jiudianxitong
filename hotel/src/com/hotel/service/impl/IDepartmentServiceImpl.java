/**
 * @author zyz
 * @create 2021-03-11 14:49
 **/

package com.hotel.service.impl;

import com.hotel.bean.Department;
import com.hotel.dao.IDepartmentDao;
import com.hotel.service.IDepartmentService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IDepartmentServiceImpl implements IDepartmentService {
    IDepartmentDao departmentDao = SqlSessionUtil.getsession().getMapper(IDepartmentDao.class);

    @Override
    public List<Department> selectAll() {
        return departmentDao.selectAll();
    }

    @Override
    public Department selectOne(int dId) {
        return departmentDao.selectOne(dId);
    }

    @Override
    public boolean addDpt(Department dept) {
        return departmentDao.addDpt(dept) > 0 ? true : false;
    }

    @Override
    public boolean updateDpt(Department dpt) {
        return departmentDao.updateDpt(dpt) > 0 ? true : false;
    }

    @Override
    public boolean deleteDpt(int id) {
        return departmentDao.deleteDpt(id) > 0 ? true : false;
    }

}
