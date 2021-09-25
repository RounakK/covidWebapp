package com.covid.covidWebapp.repository;

import com.covid.covidWebapp.bean.User;
import com.covid.covidWebapp.bean.Zone;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class ZoneRepository {


    private Map<Integer, Zone> zones;

    public ZoneRepository(){
        this.zones = new HashMap<>();

    }

    public int add(Zone zone){
        zones.put(zone.getPinCode(), zone);
        return zone.getPinCode();
    }

    public Zone getZone(int pinCode){
        return zones.get(pinCode);
    }

    public Zone getNewZone(int pinCode){
        Zone zone = new Zone();
        zone.setPinCode(pinCode);
        zones.put(zone.getPinCode(), zone);
        return zone;

    }


}
