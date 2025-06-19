package com.snowflakes.demo.testcontroller;

import com.snowflakes.demo.service.LoadService;
import org.hibernate.boot.registry.classloading.spi.ClassLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/load")
    public String triggerLoad() {
        loadService.manualLoadTrigger();
        return  "Manual Load Triggered";
    }


}
