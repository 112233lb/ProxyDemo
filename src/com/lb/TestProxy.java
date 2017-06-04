package com.lb;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * 动态代理测试
 * @author LB
 * 2017年6月4日 下午3:16:15
 */
public class TestProxy {
	
	@Test
	public void test(){
		DemoService target=new DemoServiceImpl(); //委托类
		//创建代理对象
		DemoService proxy=(DemoService) Proxy.newProxyInstance(
				target.getClass().getClassLoader(), //选择ClassLoader对象来加载我们的代理对象
				target.getClass().getInterfaces(),  //我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
				new MyInvocationHandler(target)); //将这个代理对象关联到了上方的 InvocationHandler 这个对象上
		
		System.out.println(proxy.proxyDemo("刘彬")); //调用委托类方法	
	}
}
