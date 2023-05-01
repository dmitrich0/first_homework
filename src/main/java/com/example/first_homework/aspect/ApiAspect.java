package com.example.first_homework.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class ApiAspect {
    private Integer counter = -1;
    @Autowired
    ApiConfiguration apiConfiguration;

    @Around("@annotation(ApiAudit)")
    public Object auditApi(ProceedingJoinPoint joinPoint) throws Throwable {
        counter += 1;
        if (counter > this.apiConfiguration.getMaxApiCalls()) {
            return "Limit of API calls exceeded";
        } else {
            return joinPoint.proceed();
        }
    }
}
