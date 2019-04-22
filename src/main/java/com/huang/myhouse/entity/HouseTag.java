package com.huang.myhouse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author hsz
 */

@Data
@Entity
@Table(name = "tb_house_tag")
public class HouseTag implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "house_id")
    private Long houseId;
}
