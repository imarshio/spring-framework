# Springboot 启动源码解读

```java


```

这里我们默认使用 AnnotationConfigApplicationContext 类，因为 springboot 最终引用的就是这个类我们首先要知道，类加载的机制是双亲委派机制，即在加载 AnnotationConfigApplicationContext 类之前会先加载其父类， 也就是 GenericApplicationContext，同样的 AbstractApplicationContext，在向上 DefaultResourceLoader 加载顺序如下 DefaultResourceLoader -> AbstractApplicationContext -> GenericApplicationContext -> AnnotationConfigApplicationContext 这过程中只是涉及到了类加载，不涉及到类初始化的，即类中的静态变量、静态函数、静态代码块、