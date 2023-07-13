package com.hotel.bean;
/**
 * @author lk
 *客户级别实体类
 **/
public class Clientlevel {
    /**
     *客户等级序号
     */
    private int level;
    /**
     *等级描述
     */
    private String levelName;
    /**
     *客户等级表无参构造
     */
    public Clientlevel() {
    }
    /**
     *客户等级表全参构造
     */
    public Clientlevel(int level, String levelName) {
        this.level = level;
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return  levelName ;
    }

    /**
     *get set 方法
     */
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
}
