
package com.hotel.service.impl;
/**
 * @author zyz
 * @create 2021-03-11 10:30
 * 员工业务逻辑接口实现
 **/

import com.hotel.bean.Employees;
import com.hotel.dao.IEmployeesDao;
import com.hotel.service.IEmployeeService;
import com.hotel.util.SqlSessionUtil;

import java.util.Date;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    IEmployeesDao employeesDao = SqlSessionUtil.getsession().getMapper(IEmployeesDao.class);

    @Override
    public List<Employees> selectAll() {
        return employeesDao.selectAll();
    }

    @Override
    public Employees selectOne(int eId) {
        return employeesDao.selectOne(eId);
    }

    @Override
    public boolean addEmp(Employees emp) {
        return employeesDao.addEmp(emp) > 0 ? true : false;
    }

    @Override
    public boolean delete(int eId) {
        return employeesDao.deleteEmp(eId) > 0 ? true : false;
    }

    @Override
    public boolean update(Employees employees) {
        return employeesDao.updateEmp(employees) > 0 ? true : false;
    }

    @Override
    public Employees find(String name) {
        return employeesDao.find(name);
    }
}