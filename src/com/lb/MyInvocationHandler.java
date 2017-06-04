package com.lb;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 定义编辑动态代理类
 * @author LB
 * 2017年6月4日 下午2:48:01
 */
public class MyInvocationHandler implements InvocationHandler{
	
	private Object target;  //目标对象的引用 
	
	public MyInvocationHandler(Object target){
		this.target=target;
	}
	
	//第一个参数的用处
	//1. 可以使用反射获取代理对象的信息（也就是proxy.getClass().getName()）。
	//2. 可以将代理对象返回以进行连续调用，这就是proxy存在的目的。因为this并不是代理对象，
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用目标对象之前");  //before
		System.out.println("class:  "+target.getClass().getName()+"   method:  "+method.getName()+"   args:  "+args);
		 //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		Object result=method.invoke(target, args); //调用目标对象的方法
		
		System.out.println("调用目标对象之后:"+result);//after
		return result;
	}

}
