package com.adinfost.main.controller;

import com.adinfost.main.bean.Category;
import com.adinfost.main.service.MainService;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping("/data")
    public List<Document> getInfo(){
        return mainService.getInfo();
    }

    @RequestMapping("/category")
    public List<Category> getCategory(){
        List<String> names = Arrays.asList("one", "two", "tree", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen");
        return names.stream().map(Category::new).collect(Collectors.toList());
    }
}
