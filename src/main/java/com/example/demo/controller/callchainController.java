package com.example.demo.controller;
import com.example.demo.pojo.callchain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.callchainService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
class callchainController {
    @Autowired
    private callchainService callchainService;

    @RequestMapping(value = "findAll")
    public String findAll(HttpServletRequest request) {
        List<callchain> list = callchainService.findAll();
        request.setAttribute("callchainlist", list);
        return "callchainlist";

    }

}
