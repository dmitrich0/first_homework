package com.example.first_homework.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
@Aspect
public class ApiAspect {
    private final Map<String, Integer> apiCalls = new ConcurrentHashMap<>();
    @Autowired
    private ApiConfiguration apiConfiguration;

    @Around("@annotation(ApiAudit)")
    public ResponseEntity<String> auditApi(ProceedingJoinPoint joinPoint) throws Throwable {
        var key = joinPoint.toString();
        if (!apiCalls.containsKey(key)){
            apiCalls.put(key, 1);
        } else {
            apiCalls.put(key, apiCalls.get(key) + 1);
        }
        if (apiCalls.get(key) > this.apiConfiguration.getMaxApiCalls()) {
            return new ResponseEntity<>("Too many requests! Max requests count is %s".formatted(this.apiConfiguration
                    .getMaxApiCalls()), HttpStatus.TOO_MANY_REQUESTS);
        } else {
            return new ResponseEntity<>(joinPoint.proceed().toString(), HttpStatus.OK);
        }
    }
}
