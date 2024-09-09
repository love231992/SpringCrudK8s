package org.example.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoRepository demoRepository;

    @PostMapping("/createUser")
    public String createUser(@RequestBody DemoEntity demoEntity){
        demoRepository.save(demoEntity);
        return "success user created";
    }

    @GetMapping("/getUser")
    public List<DemoEntity> getAllUsers(){
        return demoRepository.findAll();
    }
}
