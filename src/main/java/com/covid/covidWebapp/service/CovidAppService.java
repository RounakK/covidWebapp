package com.covid.covidWebapp.service;

import com.covid.covidWebapp.bean.User;
import com.covid.covidWebapp.repository.AdminRepository;
import com.covid.covidWebapp.repository.UserRepository;
import com.covid.covidWebapp.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CovidAppService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ZoneRepository zoneRepository;


    public String registerUser(String name, int phoneNumber, int pinCode){
        User user = new User();
        int id = 0;
        user.setMob(phoneNumber);
        user.setName(name);
        if(zoneRepository.getZone(pinCode)==null){
            user.setZone(zoneRepository.getNewZone(pinCode));
        }else{
            user.setZone(zoneRepository.getZone(pinCode));
        }
        id = userRepository.add(user);
        return "userId:"+id;

    }

    public int selfAssesment(int id, String symptoms, boolean travelHistory, boolean contact){
        User user = userRepository.getUser(id);
        ArrayList<String> userSymptoms = user.getSymptopms();
        boolean flag = true;
        for(String s : userSymptoms){
            if(s.equals(symptoms))
                flag = false;
        }
        if(flag)
            userSymptoms.add(symptoms);
        user.setContact(contact);
        user.setTravel(travelHistory);
        user.setCovidRisk(getAssesment(user));

        return user.getCovidRisk();

    }

    private int getAssesment(User user){
        if(user.getSymptopms()==null && !user.getTravel() && !user.isContact()){
            return 5;
        }else if(user.getSymptopms().size()==1 && user.getTravel() && user.isContact()){
            return 50;
        }else if(user.getSymptopms().size()==2 && user.getTravel() && user.isContact()){
            return 75;
        }else if(user.getSymptopms().size()>1 && user.getTravel() && user.isContact()){
            return 95;
        }

        return 0;
    }
}
