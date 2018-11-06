package com.nt.Advice;
import java.util.Arrays;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class PerformanceMonitoring implements MethodInterceptor
{
	private long start,end;
	@Override
	public Object invoke(MethodInvocation inovation) throws Throwable
	{
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=inovation.proceed();
		end=System.currentTimeMillis();
		System.out.println(inovation.getMethod().getName()+"With Argument"+Arrays.toString(inovation.getArguments())+"Has Token"+(start-end)+"ms");
		return retVal;
	}
	

}
