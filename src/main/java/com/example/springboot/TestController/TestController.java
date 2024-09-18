package com.example.springboot.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;

@RestController
public class TestController {

    // Mapping for /test URL
    @GetMapping("/test")
    public String message() {
        return "hello";
    }

    // Mapping for /test2 URL with a request parameter
    //http://localhost:8080/test2?name=test need give url like this 
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String messageWithParam(@RequestParam String name) {
        return "hello " + name;
    }
    
    @RequestMapping(value = "/test3/{name}/{message}", method = RequestMethod.GET)
    //http://localhost:8080/test3/sowmitha/i%20am%20learning%20spring%20boot need to pass url like this.
    public String messagewithPathVariable(@PathVariable String name ,@PathVariable String message) {
    	
        return "hello" +" " +message +" " +name;
    }
    
    
    @RequestMapping(value= "/add", method = RequestMethod.POST)

    public String messagewithObject(@RequestBody User user) {
    	
        return "ID: "+user.getId() +" name: "+user.getName() +" Dept : "+user.getDept();
    }
    
    
    

    
}
