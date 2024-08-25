package com.example.bfhl.model;

import java.util.List;

public class ResponseData {
    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;
    private List<String> numbers;
    private List<String> alphabets;
    private String highest_lowercase_alphabet;

    // Getters and Setters
    // Constructor for convenience
    public ResponseData(boolean is_success, String user_id, String email, String roll_number, List<String> numbers, List<String> alphabets, String highest_lowercase_alphabet) {
        this.is_success = is_success;
        this.user_id = user_id;
        this.email = email;
        this.roll_number = roll_number;
        this.numbers = numbers;
        this.alphabets = alphabets;
        this.highest_lowercase_alphabet = highest_lowercase_alphabet;
    }
}
