package com.hotel.service;

import com.hotel.bean.Clientlevel;

import java.util.List;

/**
 * @author lk
 * 客户级别业务逻辑接口
 */
public interface IClientlevelService {
    /**
     * 查询所有客户级别信息
     * @return
     */
    public List<Clientlevel> selectAll();

    /**
     * 根据客户级别id查询客户
     * @param level
     * @return 客户对象
     */
    public Clientlevel selectOne(int level);
    /**
     * 添加客户级别
     * @param cle
     */
    public boolean addCle(Clientlevel cle);

    /**
     * 更新客户级别
     * @param cle
     */
    public boolean  updateCle(Clientlevel cle);

    /**
     * 删除客户级别
     * @param level
     */
    public boolean deleteCin(int level);
}
