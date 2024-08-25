package com.example.bfhl.controller;

import com.example.bfhl.model.RequestData;
import com.example.bfhl.model.ResponseData;
import com.example.bfhl.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping
    public ResponseEntity<ResponseData> handlePost(@RequestBody RequestData requestData) {
        ResponseData responseData = apiService.processData(requestData);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> handleGet() {
        return ResponseEntity.ok().body("{ \"operation_code\": 1 }");
    }
}
