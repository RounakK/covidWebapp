package com.covid.covidWebapp.controller;


import com.covid.covidWebapp.bean.User;
import com.covid.covidWebapp.repository.AdminRepository;
import com.covid.covidWebapp.repository.UserRepository;
import com.covid.covidWebapp.repository.ZoneRepository;
import com.covid.covidWebapp.service.CovidAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidAppController {

    @Autowired
    private CovidAppService service;



    @RequestMapping(path = "/registerUser", method = RequestMethod.POST)
    public String registerUser(String name, int phoneNumber, int pinCode){
       return service.registerUser(name, phoneNumber, pinCode);

    }

    @RequestMapping(path = "/selfAssesment", method = RequestMethod.POST)
    public String selfAssesment(int id, String symptoms, boolean travelHistory, boolean contact){


    }


    @RequestMapping(path = "/registerAdmin", method = RequestMethod.POST)
    public String registerAdmin(User user){


    }

    @RequestMapping(path = "/updateCovidResult", method = RequestMethod.POST)
    public String updateCovidResult(){


    }

    @RequestMapping(path = "/getZoneInfo", method = RequestMethod.POST)
    public String getZoneInfo(){


    }

}
