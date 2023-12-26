/*package POA.AspectJ;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;

@Aspect
public class OrderProcessingAspect {
    @Before("execution(void createOrder())")
    public void beforeOrderCreation(JoinPoint joinPoint) {
        System.out.println("Order creation started");
    }
    @After("execution(void processPayment())")
    public void afterOrderPayment(JoinPoint joinPoint) {
        System.out.println("Payment processed");
    }
}
*/