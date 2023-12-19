package com.thezecter.patient.controller;

import com.thezecter.patient.model.Pats;
import jakarta.ws.rs.QueryParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static java.util.Map.entry;

@RestController
@RequestMapping("v1")
public class PatientController {

    @GetMapping("list")
    public Map<String, String> patientList() {
        return Map.ofEntries(
                entry("success", "200"),
                entry("data", "The patient list")
        );
    }

    @PostMapping("register")
    public ResponseEntity<Pats> create(@RequestBody Pats pats) {
        return ResponseEntity.ok(pats);
    }

    @GetMapping("test")
    public String test(
            @RequestParam("name") String name,
            @RequestParam("number") Integer id
    ) {
        return name + " " + id;
    }
}
