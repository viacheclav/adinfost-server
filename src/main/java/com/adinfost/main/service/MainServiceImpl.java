package com.adinfost.main.service;

import com.adinfost.main.dao.MainDao;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private MainDao mainDao;

    @Override
    public List<Document> getInfo(){
        return mainDao.getInfo();
    }
}
