package miu.example.Lab4.aspects;

import miu.example.Lab4.entities.Logger;
import miu.example.Lab4.services.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import miu.example.Lab4.annotations.ExecutionTime;

@Component
@Aspect
public class LoggerAspect {
    private Logger log = new Logger();

    @Autowired
    LoggerService loggerService;

    @After("execution(* miu.example.Lab4.controllers.UserController+.*(..))")
    public void afterUserController(JoinPoint joinPoint) {
        log.setPrinciple("Guest User");
        String actionClass = classNameExtract(joinPoint.getSignature().getDeclaringTypeName());
        log.setOperation(actionClass + " > " + joinPoint.getSignature().getName());
        loggerService.save(log);
    }

    @After("execution(* miu.example.Lab4.controllers.PostController+.*(..))")
    public void afterPostController(JoinPoint joinPoint) {
        log.setPrinciple("Guest User");
        String actionClass = classNameExtract(joinPoint.getSignature().getDeclaringTypeName());
        log.setOperation(actionClass + " > " + joinPoint.getSignature().getName());
        loggerService.save(log);
    }

    @After("execution(* miu.example.Lab4.controllers.CommentController+.*(..))")
    public void afterCommentController(JoinPoint joinPoint) {
        log.setPrinciple("Guest User");
        String actionClass = classNameExtract(joinPoint.getSignature().getDeclaringTypeName());
        log.setOperation(actionClass + " > " + joinPoint.getSignature().getName());
        loggerService.save(log);
    }

    @Around("@annotation(executionTime)")
    public Object around(ProceedingJoinPoint joinPoint, ExecutionTime executionTime) throws Throwable {
        Long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        Long executionTimeMilli = System.currentTimeMillis() - startTime;
        System.out.println(joinPoint.getSignature().getName() + " executed in " + executionTimeMilli + "ms");
        return proceed;
    }

    private String classNameExtract(String strClasses) {
        String[] strArray = strClasses.split("\\.");
        return strArray[strArray.length-1];
    }

}
