package com.huang.myhouse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hsz
 */

@Data
@Entity
@Table(name = "tb_house_subscribe")
public class HouseSubscribe implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "desc")
    private String desc;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "admin_id")
    private Long adminId;
}
