package com.example.restfulwebservices.helloworld;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
//Controller
@RestController
public class HelloWorldController
{
    //using get method and hello-world URI
    @GetMapping(path="/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping(path="/hello-world-bean")
//method- which returns "Hello World"
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello World");//constructor of HelloWorldBean
    }
    //passing a path variable
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello World, %s", name)); //%s replace the name
    }
}