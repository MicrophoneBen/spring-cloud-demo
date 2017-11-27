package com.elliot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Elliot on 2017/9/23.
 */
@RestController
public class AddController {

    @Value("${server.port}")
    private String prot;

    @RequestMapping("/add")
    public String add(@RequestParam int x, @RequestParam int y) {
        return prot + "\t" + (x + y);
    }
}
