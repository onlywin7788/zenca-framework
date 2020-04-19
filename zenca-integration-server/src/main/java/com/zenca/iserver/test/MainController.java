package com.zenca.iserver.test;

import com.zenca.iserver.config.manager.Configuration;
import com.zenca.iserver.database.Connector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    Connector connector = new Connector();

    @RequestMapping("/")
    public String greet() {

        try {
            connector.testConnection();
            Configuration config = new Configuration();
            config.load();
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        return "hello world 22";
    }
}
