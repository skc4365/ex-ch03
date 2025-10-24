package com.skc.mybatis.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// 실행시간측정

@Slf4j
@Aspect
@Component
public class PerformanceAspect {

	@Around("execution(* com.skc.mybatis.service.*.*(..))")
	public Object measureTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end = System.currentTimeMillis();

		log.info("##### 실행시간: {} = {}ms #####", pjp.getSignature(), (end - start));
		return result;

	}

}
