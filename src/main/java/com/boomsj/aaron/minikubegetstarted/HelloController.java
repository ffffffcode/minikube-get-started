package com.boomsj.aaron.minikubegetstarted;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aaron
 * @version 1.0
 * @description
 * @date 2021/7/19 14:40
 */
@Slf4j
@RestController
@RequestMapping("k8s/hello")
public class HelloController {

    @GetMapping()
    public String hello() {
        log.info("---------->访问 hello 接口");
        return "hello, k8s";
    }

    @Value("${name:minikube}")
    private String name;

    @GetMapping("/name")
    public String name() {
        log.info("---------->访问 name 接口");
        return name;
    }

}
