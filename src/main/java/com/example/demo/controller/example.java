package com.example.demo.controller;

import com.example.demo.Converter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/converter")
public class example {

    @PostMapping("/convert")
    public ResponseEntity<StringBuilder> add(@RequestBody String converter) {
        return ResponseEntity.ok(Converter.convert(converter));
    }
}
