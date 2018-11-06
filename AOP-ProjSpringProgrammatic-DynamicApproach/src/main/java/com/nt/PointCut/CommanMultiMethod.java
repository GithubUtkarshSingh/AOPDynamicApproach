package com.nt.PointCut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.ArithmeticOperation;

public class CommanMultiMethod extends DynamicMethodMatcherPointcut
{
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object...args)
	{
	if(method.getName().equals("mul")&& targetClass==ArithmeticOperation.class && ((Integer)args[0])>=1000 && ((Integer)args[1])>=1000)
		{
		return true;
		}
	else
	{
	return false ;
	}

}
}