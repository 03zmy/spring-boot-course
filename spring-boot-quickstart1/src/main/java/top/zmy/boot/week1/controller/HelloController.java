package top.zmy.boot.week1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zmy
 * @Date: 2025/9/4
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello()
    {
        return "hello world";
    }
    @GetMapping("/list")
    public List<String> getList() {
        return List.of("aaa", "bbb", "ccc");
    }

}
