package com.genpt.nsight.geolocationapi.repos;

import com.genpt.nsight.geolocationapi.entities.SiteTimeZone;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.repository.CassandraRepository;

@Table(value="site_timezone")
public interface SiteTimeZoneRepository extends CassandraRepository<SiteTimeZone, String> {
}
