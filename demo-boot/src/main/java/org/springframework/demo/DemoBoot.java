package org.springframework.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.demo.controller.HelloWorldController;

@ComponentScan(value = "org.springframework.demo")
public class DemoBoot {

	public static void main(String[] args) {
		// 这里我们默认使用 AnnotationConfigApplicationContext 类，因为 springboot 最终引用的就是这个类
		// 我们首先要知道，类加载的机制是双亲委派机制，即在加载 AnnotationConfigApplicationContext 类之前会先加载其父类，
		// 也就是 GenericApplicationContext，同样的 AbstractApplicationContext，在向上 DefaultResourceLoader
		// 加载顺序如下
		// DefaultResourceLoader -> AbstractApplicationContext -> GenericApplicationContext -> AnnotationConfigApplicationContext
		// 这过程中只是涉及到了类加载，不涉及到类初始化的，即类中的静态变量、静态函数、静态代码块、
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoBoot.class);

		// 获取 bean
		HelloWorldController helloWorld = context.getBean(HelloWorldController.class);
		System.out.println(helloWorld.sayHello());
	}
}