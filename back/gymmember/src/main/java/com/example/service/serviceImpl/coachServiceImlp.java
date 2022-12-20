package com.example.service.serviceImpl;

import com.example.dao.coachDao;
import com.example.model.coach;
import com.example.service.coachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class coachServiceImlp implements coachService {

    @Autowired
    private coachDao coaDao;

    @Override
    public List<coach> findAll() {
        return coaDao.findAllCoaches();
    }

    @Override
    public coach findone(String id) {
        return coaDao.findCoachById(id);
    }

    @Override
    public int insert(coach coa) {
        return coaDao.insert(coa);
    }

    @Override
    public int update(coach coa) {
        return coaDao.update(coa);
    }

    @Override
    public int delete(String id) {
        return coaDao.delete(id);
    }
}

