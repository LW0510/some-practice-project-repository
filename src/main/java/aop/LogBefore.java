package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author lw
 * @classname LogBefore
 * @description TODO
 * @date 2019/04/07 上午 10:17
 */

//普通类 --》  前置通知
@Aspect
@Component
public class LogBefore  {
        @Pointcut("execution(public void service.UserServiceImpl.addUser(..)))")
        public void firstPointcut(){}

        @Before(value = "firstPointcut()")
        public void myBeforeAdvice(){
                System.out.println("前置通知。。。");

        }

        @After(value = "firstPointcut()")
        public void myAfterAdvice(){
                System.out.println("后置通知。。。");

        }




}
