package com.demo;
/**
 * 单例模式：
 * 懒汉模式
 * @author fan
 * 创建时间：2018年6月25日
 */
public class Singleton2 {
	//1.将默认的构造方法私有化，让外部不能创建对象
	private Singleton2() {}
	
	//2.声明一个对象
	private static Singleton2 instance ;
	
	//3.提供一个方法供外部调用来获得该对象
	public static Singleton2 getInstance() {
		if(instance == null){
			//如果instance为空就将其实例化
			instance = new Singleton2();
		}
		//如果不为空就直接返回
		return instance;
		
	}
}
