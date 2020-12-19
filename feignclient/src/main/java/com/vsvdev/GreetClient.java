package com.vsvdev;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eurekaclient")
public interface GreetClient {

    @RequestMapping("/greeting")
    String greeting();

}
