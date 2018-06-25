package com.demo;

import org.junit.jupiter.api.Test;

class SingletonTest {
	/**
	 * 测试饿汉模式
	 */
	@Test
	void test1() {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		if (s1 == s2) {
			System.out.println("s1和s2是同一个对象！");
		} else {
			System.out.println("s1和s2不是同一个对象！");
		}
	}

	/**
	 * 测试懒汉模式
	 */
	@Test
	void test2() {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		if (s1 == s2) {
			System.out.println("s1和s2是同一个对象！");
		} else {
			System.out.println("s1和s2不是同一个对象！");
		}
	}

}
