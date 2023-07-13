package com.hotel.dao;


import com.hotel.bean.Clientinfo;
import com.hotel.bean.Clientlevel;

import java.util.List;

/**
 * @author lk
 *客户等级数据访问接口
 **/
public interface IClientlevelDao {
    /**
     * 查询所有客户级别信息
     * @return
     */
    public List<Clientlevel> selectAll();

    /**
     * 根据客户级别id查询客户级别
     * @param level
     * @return 客户对象
     */
    public Clientlevel selectOne(int level);

    /**
     * 添加客户级别
     * @param cle
     */
    public int addCle(Clientlevel cle);

    /**
     * 更新客户级别
     * @param cle
     */
    public int  updateCle(Clientlevel cle);

    /**
     * 删除客户级别
     * @param level
     */
    public int deleteCin(int level);
}
