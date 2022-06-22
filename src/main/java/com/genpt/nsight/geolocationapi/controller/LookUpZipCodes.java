package com.genpt.nsight.geolocationapi.controller;

import com.genpt.nsight.geolocationapi.entities.DistanceMatrixMapping;
import com.genpt.nsight.geolocationapi.entities.Site;
import com.genpt.nsight.geolocationapi.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LookUpZipCodes {

    @Autowired
    SiteService siteService;


    //GETS DATA FOR ALL SITES
    @GetMapping(path = "/site")
    public List<Site> getSiteData() {
        //return siteService.getSiteDataByAliasNameAndAliasValue();
        return siteService.fetchAllSites();
    }

    // DATA FOR STORES ONLY
    @GetMapping(path = "/site/store")
    public List<Site> getStoreData() {
        //return siteService.getSiteDataByAliasNameAndAliasValue();
        return siteService.getStoresFromSites();
    }

    // DATA FOR DCs ONLY
    @GetMapping(path = "/site/dc")
    public List<Site> getDCData() {
        //return siteService.getSiteDataByAliasNameAndAliasValue();
        return siteService.getDCsFromSites();
    }

    // DATA FOR SUPPLIERS ONLY
    @GetMapping(path = "/site/supplier")
    public List<Site> getSupplierData() {
        //return siteService.getSiteDataByAliasNameAndAliasValue();
        return siteService.getSuppliersFromSites();
    }

    @GetMapping("/test")
    public List<Site> findLocationMatchingRadius() {
//        SampleData sampleData = new SampleData();
//
//        List<Site> responseSites = new ArrayList<>();
//
//        int sourceZipCode = 30040;
//
//        List<DistanceMatrixMapping> distanceMatrixMappings = sampleData.getDistanceMatrixMappingsList();
//
//        for (DistanceMatrixMapping matrixMapping:distanceMatrixMappings)
//            if (matrixMapping.getDestinationZipCode() == sourceZipCode) {
//                for (Site site : sampleData.getLocationList()) {
//                    if (site.getZipCode() == sourceZipCode) {
//                        responseSites.add(site);
//                    }
//                }
//            } else {
//                //TODO: computation to calcuate distance
//            }
//    return responseSites;
        return null;
    }
}
