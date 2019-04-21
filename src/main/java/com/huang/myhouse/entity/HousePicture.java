package com.huang.myhouse.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hsz
 */

@Data
@Entity
@Table(name = "tb_house_picture")
public class HousePicture {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "house_id")
    private Long houseId;

    @Column(name = "cdn_prefix")
    private String cdnPrefix;

    @Column(name = "width")
    private Integer width;

    @Column(name = "heigth")
    private Integer height;

    @Column(name = "location")
    private String location;

    @Column(name = "path")
    private String path;
}
