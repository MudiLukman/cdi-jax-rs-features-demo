package com.kontrol.cdi.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logging
@Interceptor
public class ConsoleLogger {

    @AroundInvoke
    public Object logMethodCall(InvocationContext invocationContext) throws Exception{
        int nbOfParams = invocationContext.getMethod().getParameterCount();
        if (nbOfParams == 0) {
            System.out.println("method called with no args");
        } else {
            System.out.printf("method has %d args\n", nbOfParams);
        }
        return invocationContext.proceed();
    }
}
