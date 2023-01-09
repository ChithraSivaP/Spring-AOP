package com.kgisl.zproject.config;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectLog implements ThrowsAdvice
{
    Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    // private Logger LOGGER = Logger.getLogger(this.getClass());
    @Pointcut("execution(* com.kgisl.spAop.service.*.*(..))")
    public void controller() {
    }
    @Pointcut("execution(* com.kgisl.spAop.service.*.*(..))")
    protected void allMethod() {
    }
    @Before("execution(* com.kgisl.spAop.service.*.*(..))")
    public void beforelog(JoinPoint point) 
    {
        LOGGER.info("-----------------------@Before advice called--------------------------------------");
        LOGGER.debug("Class Name :  " + point.getSignature().getDeclaringTypeName());
        LOGGER.info("Entering in Method :  " + point.getSignature().getName());
        LOGGER.warn("Argumentsttt :  " + Arrays.toString(point.getArgs()));
    } 
}