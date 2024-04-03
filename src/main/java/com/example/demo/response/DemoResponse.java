package com.example.demo.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DemoResponse {
    private String name;
    private List<String> value;
}
