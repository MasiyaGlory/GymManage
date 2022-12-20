package com.example.controller;

import com.example.dao.adminorderDao;
import com.example.model.adminorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adminorder")
public class adminorderController {
    @Autowired
    private adminorderDao adoDao;

    @GetMapping("/GetAll")
    public List<adminorder> getAdminOrder(){
        List<adminorder> all1=adoDao.findAllCurses();
        List<adminorder> all2=adoDao.findAllCoaches();
        all1.addAll(all2);
        System.out.println(all1);

        return all1;
    }
}
