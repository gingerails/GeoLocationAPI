package com.genpt.nsight.geolocationapi.repos;

import com.genpt.nsight.geolocationapi.entities.Site;
import com.genpt.nsight.geolocationapi.entities.SiteKey;
import com.genpt.nsight.geolocationapi.entities.SiteTimeZone;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteRepository extends CassandraRepository<Site, SiteKey> {

//    // query to find all by site type
//    @Query("select * from site where alias_name=?0 allow filtering")  // I have no clue how to do this without Allow Filtering
//    List<Site> findAllBy(String alias_name);                           //Unless I made a new table ?
//
//    @Query("select * from site where site_type=?0 allow filtering")
//    List<Site> findAllBySiteType(String type);

}
