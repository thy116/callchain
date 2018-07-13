package com.example.demo.service;

import com.example.demo.pojo.callchain;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.demo.mapper.callchainMapper;

import java.io.Serializable;
import java.util.List;

@Service
public class callchainService implements Serializable {
    @Autowired
    private callchainMapper CallchainMapper;

    public List<callchain> findAll(){
        return CallchainMapper.findAll();
    }

}
