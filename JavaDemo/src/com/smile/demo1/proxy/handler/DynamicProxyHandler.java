package com.smile.demo1.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	Object realObj;

	public DynamicProxyHandler() {
		// TODO Auto-generated constructor stub
	}

	public DynamicProxyHandler(Object realObj) {
		// TODO Auto-generated constructor stub
		this.realObj=realObj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		 //　　在代理真实对象前
		System.out.println("before invoke method： "+method.getName());
		  //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(realObj, args);
        //　　在代理真实对象后
        System.out.println("after invoke");
		
		return null;
	}

}
