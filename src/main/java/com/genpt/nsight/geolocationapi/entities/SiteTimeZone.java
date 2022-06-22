package com.genpt.nsight.geolocationapi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;


@Table(value="site_timezone")
@Getter
@Setter
public class SiteTimeZone {
    @PrimaryKey
    private String zipCode;
    @Column
    private BigDecimal latitude;
    @Column
    private BigDecimal longitude;


}