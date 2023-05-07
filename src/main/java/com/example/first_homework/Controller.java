package com.example.first_homework;

import PasswordValidator.CombinedConstraint;
import PasswordValidator.PasswordConstraint;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController()
@Validated
public class Controller {
    @PostMapping("/combined")
    public ResponseEntity<String> returnSameValueCombinedConstraint(@Valid @RequestBody @CombinedConstraint String value) {
        return ResponseEntity.ok(value);
    }
    @PostMapping("/password")
    public ResponseEntity<String> returnSameValuePasswordConstraint(@Valid @RequestBody @PasswordConstraint String value) {
        return ResponseEntity.ok(value);
    }
}
