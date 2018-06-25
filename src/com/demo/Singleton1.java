package com.demo;
/**
 * 单例模式：
 * 饿汉模式
 * @author fan
 * 创建时间：2018年6月25日
 */
public class Singleton1 {
	//1.将默认的构造方法私有化，让外部不能创建对象，使用private修饰
	private Singleton1() {}
	
	//2.实例化一个对象,使用private、static修饰
	private static Singleton1 instance = new Singleton1();
	
	//3.提供一个方法供外部调用来获得该对象，使用public static修饰
	public static Singleton1 getInstance() {
		return instance;
	}
}
