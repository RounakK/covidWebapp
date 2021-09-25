package com.covid.covidWebapp.repository;

import com.covid.covidWebapp.bean.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AdminRepository {
    private Map<Integer, Admin> admins;

    public AdminRepository(){
        this.admins = new HashMap<>();
    }

    public int add(Admin admin){
        admins.put(admin.getId(), admin);
        return admin.getId();
    }

    public Admin getAdmin(int id){
        return admins.get(id);
    }

}
