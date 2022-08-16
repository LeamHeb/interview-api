package com.candidates.interviewapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/reversal")
public class StringReversalController {

    // localhost:8080/api/v1/reversal/<string-goes-here>
    @GetMapping("/{stringToReverse}")
    public ResponseEntity<String> reverseString(@PathVariable String stringToReverse) {
        return new ResponseEntity<String>(stringToReverse, HttpStatus.OK);
    }
}
