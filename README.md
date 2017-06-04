动态代理：
	代理类实现的接口：InvocationHandler
								接口中的方法 invoke(),此方法用于调用目标对象(委托类)
	测试动态代理：Proxy中的newProxyInstance()方法实例化代理类