package com.example.demo.controller;

import com.example.demo.request.DemoRequest;
import com.example.demo.response.DemoResponse;
import com.example.protobuf.ProtoRequest;
import com.example.protobuf.ProtoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @PostMapping("/withProtobuf")
    public ProtoResponse withProtobuf(@RequestBody ProtoRequest request) {
        log.info("Received {}", request);

        return ProtoResponse.newBuilder()
                .setResult("hello")
                .build();
    }

    @PostMapping("/withoutProtobuf")
    public DemoResponse withoutProtobuf(@RequestBody DemoRequest request) {
        log.info("Received {}", request);

        return DemoResponse.builder().build();
    }

}
