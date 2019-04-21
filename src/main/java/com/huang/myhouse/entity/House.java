package com.huang.myhouse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hsz
 */

@Data
@Entity
@Table(name = "tb_house")
public class House {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    /**
     * 价格
     */
    @Column(name = "price")
    private Integer price;

    /**
     * 面积
     */
    @Column(name = "area")
    private Integer area;

    /**
     * 卧室数量
     */
    @Column(name = "room")
    private Integer room;

    /**
     * 楼层
     */
    @Column(name = "floor")
    private Integer floor;

    /**
     * 总楼层
     */
    @Column(name = "total_floor")
    private Integer totalFloor;

    /**
     * 被看次数
     */
    @Column(name = "watch_times")
    private Integer watchTimes;

    /**
     * 建立年限
     */
    @Column(name = "build_year")
    private Integer buildYear;

    /**
     * 房屋状态 0-未审核 1-审核通过上架 2-下架
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 上次更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 城市名
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 地区名
     */
    @Column(name = "region_name")
    private String regionName;

    /**
     * 街道
     */
    @Column(name = "street")
    private String street;

    /**
     * 详细地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 封面
     */
    @Column(name = "cover")
    private String cover;

    /**
     * 房屋朝向
     */
    @Column(name = "direction")
    private Integer direction;

    /**
     * 地铁距离
     */
    @Column(name = "subway_distance")
    private Integer subwayDistance;

    /**
     * 客厅数量
     */
    @Column(name = "parlour")
    private Integer parlour;

    /**
     * 所在小区
     */
    @Column(name = "district")
    private String district;

    /**
     * 浴室
     */
    @Column(name = "bathroom")
    private Integer bathroom;
}
