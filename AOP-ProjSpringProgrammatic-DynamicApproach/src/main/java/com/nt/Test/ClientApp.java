package com.nt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ArithmeticOperation;

public class ClientApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
    	ArithmeticOperation proxy=null;
    	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
    	proxy=ctx.getBean("pfb",ArithmeticOperation.class);
    	System.out.println("Add=="+proxy.Add(20, 50));
    	System.out.println("Sub=="+proxy.Sub(40,20));
    	System.out.println("Mul=="+proxy.mul(20, 30));
    	System.out.println("Div=="+proxy.Div(40, 10));
    }
}