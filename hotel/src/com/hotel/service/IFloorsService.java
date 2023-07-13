package com.hotel.service;

import com.hotel.bean.Floors;

import java.util.List;
/**
 * Service层楼层信息接口
 * @author sh
 */
public interface IFloorsService {

    /**
     * @param fId 楼层标号
     * @return 楼层名称
     */
    public List<Floors> findByfId(int fId);
}
