package com.elliot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Elliot on 2017/9/23.
 */
@RestController
public class AddController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(@RequestParam int x, @RequestParam int y) {
        return restTemplate.getForObject("http://SERVICE-ADD/add?x=" + x + "&y=" + y, String.class);
    }
}
