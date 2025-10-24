package com.skc.mybatis.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// LoggingAspect적용 : Service구현부의 메소드실행전, 실행동안(exception분리시킴), 실행후에 AOP를 구현

@Slf4j
@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.skc.mybatis.service.*.*(..))")
	public void logBefore(JoinPoint jp) {
		log.info("##### 메서드 실행전: {} #####Before#####", jp.getSignature());
	}

//	@AfterThrowing(pointcut = "execution(* com.skc.mybatis.service.*.*(..))", throwing = "excep")
//	public void logError(JoinPoint jp, Exception excep) {
//		log.info("##### 메서드\n 예외: {}, \n오류: {} #####end#####", jp.getSignature(), excep.getMessage());
//	}

	@AfterReturning(pointcut = "execution(* com.skc.mybatis.service.*.*(..))", returning = "result")
	public void logAfter(JoinPoint jp, Object result) {
		log.info("##### 메서드\n 실행성공: {}, \n결과: {} #####AfterReturning#####", jp.getSignature(), result);
	}

}
