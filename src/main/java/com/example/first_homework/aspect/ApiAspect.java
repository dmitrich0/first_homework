package com.example.first_homework.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class ApiAspect {
    private Integer counter = 0;
    @Autowired
    ApiConfiguration apiConfiguration;

    @Around("@annotation(ApiAudit)")
    public ResponseEntity<String> auditApi(ProceedingJoinPoint joinPoint) throws Throwable {
        counter += 1;
        if (counter > this.apiConfiguration.getMaxApiCalls()) {
            return new ResponseEntity<>("Too many requests! Max requests count is %s".formatted(this.apiConfiguration
                    .getMaxApiCalls()), HttpStatus.TOO_MANY_REQUESTS);
        } else {
            return new ResponseEntity<>(joinPoint.proceed().toString(), HttpStatus.OK);
        }
    }
}
