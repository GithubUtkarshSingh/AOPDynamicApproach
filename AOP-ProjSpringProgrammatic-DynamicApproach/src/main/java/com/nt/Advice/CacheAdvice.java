package com.nt.Advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor 
{
	private Map<String,Object> cacheMap=new HashMap();
	@Override
	public Object invoke(MethodInvocation inovation) throws Throwable 
	{
		String key=null;
		Object retVal=null;
		key=inovation.getMethod().getName()+Arrays.toString(inovation.getArguments());
		if(cacheMap.containsKey(key))
		{
			System.out.println("from Cache");
			retVal=cacheMap.get(key);
		}
		else
		{
			System.out.println("From target method");
			retVal=inovation.proceed();
			cacheMap.put(key,retVal);
		}
		return retVal;
	}

}
