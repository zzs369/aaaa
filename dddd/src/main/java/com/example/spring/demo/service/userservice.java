package com.example.spring.demo.service;
import com.example.spring.demo.mapper.usermapper;
import com.example.spring.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class userservice {
    @Autowired
    private usermapper userMapper;

    public user getById(int id){
        return userMapper.getById(id);
    }
}

