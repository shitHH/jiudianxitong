package com.hotel.dao;

import com.hotel.bean.Floors;

import java.util.List;

/**
 * 楼层信息接口
 * @author sh
 */
public interface IFloorsDao {

    /**
     * @param fId 楼层标号
     * @return 楼层名称
     */
     public List<Floors> findByfId(int fId);
}
