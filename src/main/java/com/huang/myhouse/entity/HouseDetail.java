package com.huang.myhouse.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author hsz
 */

@Data
@Entity
@Table(name = "tb_house_detail")
public class HouseDetail implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "layout_desc")
    private String layoutDesc;

    @Column(name = "traffic")
    private String traffic;

    @Column(name = "round_service")
    private String roundService;

    @Column(name = "rent_way")
    private Integer rentWay;

    @Column(name = "address")
    private String address;

    @Column(name = "subway_line_id")
    private Integer subwayLineId;

    @Column(name = "subway_line_name")
    private String subwayLineName;

    @Column(name = "subway_station_id")
    private Integer subwayStationId;

    @Column(name = "subway_station_name")
    private Integer subwayStationName;

    @Column(name = "house_id")
    private Long houseId;
}
