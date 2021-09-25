package com.covid.covidWebapp.repository;

import com.covid.covidWebapp.bean.Admin;
import com.covid.covidWebapp.bean.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class UserRepository {
    private Map<Integer, User> users;
    private int idCount;

    public UserRepository(){
        this.users = new HashMap<>();
    }

    public int add(User user){
        user.setId(idCount++);
        users.put(user.getId(), user);
        return user.getId();
    }

    public User getUser(int id){
        return users.get(id);
    }
    public void updateUser(User user){
        users.put(user.getId(), user);
    }
}
