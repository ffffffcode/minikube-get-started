package com.boomsj.aaron.minikubegetstarted;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aaron
 * @version 1.0
 * @description
 * @date 2021/7/19 14:40
 */
@RestController
@RequestMapping("k8s/hello")
public class HelloController {

    @GetMapping()
    public String hello() {
        return "hello, k8s";
    }
}
