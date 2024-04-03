package com.example.demo.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DemoRequest {
    private String name;
    private List<String> value;
}
