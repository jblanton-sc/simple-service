package com.blanton.simple.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    //NEVER USE method names that are implied by the API's context ... very annoying (i.e. getHelloWorld...)
    //This method has a path value to show you dynamics... but you can also use Request parameters ?myName=Whoever as an example
    @RequestMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld(@PathVariable("name") String name) {
        return new ResponseEntity<String>("Hello " + name + "!", HttpStatus.OK);
    }
}
