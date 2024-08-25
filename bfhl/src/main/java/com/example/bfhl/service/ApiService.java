package com.example.bfhl.service;

import com.example.bfhl.model.RequestData;
import com.example.bfhl.model.ResponseData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

    public ResponseData processData(RequestData requestData) {
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        String highestLowercase = null;

        for (String item : requestData.getData()) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
                if (item.matches("[a-z]")) {
                    if (highestLowercase == null || item.compareTo(highestLowercase) > 0) {
                        highestLowercase = item;
                    }
                }
            }
        }

        String userId = "john_doe_17091999";  // Replace with your logic for user_id
        String email = "john@xyz.com";        // Replace with your actual email
        String rollNumber = "ABCD123";        // Replace with your actual roll number

        return new ResponseData(true, userId, email, rollNumber, numbers, alphabets, highestLowercase);
    }
}
