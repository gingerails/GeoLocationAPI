package com.genpt.nsight.geolocationapi.service;

import com.genpt.nsight.geolocationapi.entities.Site;
import com.genpt.nsight.geolocationapi.entities.SiteTimeZone;
import com.genpt.nsight.geolocationapi.repos.SiteRepository;
import com.genpt.nsight.geolocationapi.repos.SiteTimeZoneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class SiteService {

    @Autowired
    SiteRepository siteRepository;

    @Autowired
    SiteTimeZoneRepository siteTimeZoneRepository;


    //Get list of all sites with alias_name 9 digit store number
    // This gets called by LookUpZipCodes to get the site data for all sites
    // This current approach is VERY SLOW!!!!
    @Cacheable("sites")     //condition = "siteType.equals("Store")
    public List<Site> fetchAllSites(){

        log.info("Method to fetch all sites called");

        // Create list of Site objects and find all Sites
        List<Site> sitesList = siteRepository.findAll();

        //Create List of siteTimeZone objects and find all siteTimeZones
        List<SiteTimeZone> siteTimeZoneList = siteTimeZoneRepository.findAll();

        return sitesList;

//        List<SiteTimeZone> siteTimeZones = siteTimeZoneRepository.findAll();
//        siteTimeZones.stream()
//                .forEach(site -> System.out.println(site.getZipCode()));
      //  List<Site> sites = siteTimeZones.findAll();
        //return sitesList;       //return the list so that Lookupzipcodes can use it ??
    }

    /**
     * getStoresFromSites
     * @return storeList
     */
    public List<Site> getStoresFromSites(){
        List<Site> siteList = fetchAllSites();      // get the list of all sites

        List<Site> storesList = new ArrayList<>();
        siteList.stream()
                .filter(site -> site.getSiteKey().getAliasName().equals("9 Digit Store Number"))
                .forEach(site -> storesList.add(site));         // Put into list of stores
        return storesList;
    }

    /**
     * getDCsFromSites
     * @return dcList
     */
    public List<Site> getDCsFromSites(){
        List<Site> siteList = fetchAllSites();      // get the list of all sites
        List<Site> dcList = new ArrayList<>();      // create list for only DCs
        siteList.stream()
                .filter(site -> site.getSiteKey().getAliasName().equals("DC Abbreviation Code"))
                .forEach(site -> dcList.add(site));         // Put into list of stores
        return dcList;
    }

    /**
     * getSuppliersFromSites
     * @return supplierList
     */
    public List<Site> getSuppliersFromSites() {
        List<Site> listOfSites = siteRepository.findAll(); // get the list of all sites
        List<Site> supplierList = new ArrayList<>();      // create list for only DCs
        listOfSites.stream()
                .filter(site -> site.getSiteKey().getAliasName().equals("Supplier Abbreviation Location"))
                .forEach(site -> supplierList.add(site));         // Put into list of suppliers
        return supplierList;
    }
}
