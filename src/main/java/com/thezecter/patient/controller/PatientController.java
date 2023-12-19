package com.thezecter.patient.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Map.entry;

@RestController
@RequestMapping("v1")
public class PatientController {

    @PostMapping("list")
    public Map<String, String> patientList() {
        return Map.ofEntries(
                entry("success", "200"),
                entry("data", "The patient list")
        );
    }
}
