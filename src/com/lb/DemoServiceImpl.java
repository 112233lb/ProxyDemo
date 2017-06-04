package com.lb;

/**
 * 委托类(被代理类)的实现类
 * @author LB
 * 2017年6月4日 下午2:45:25
 */
public class DemoServiceImpl implements DemoService{

	@Override
	public String proxyDemo(String name) {
		System.out.println(name+"的动态代理学习!!!");
		return "demo";
	}

}
