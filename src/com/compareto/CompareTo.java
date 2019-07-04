package com.compareto;

public class CompareTo {

	public static void main(String[] args) {
		Double number = 5.34;
		
		/*
		 * public int compareTo(number1 number2)
		 * 比较调用该方法的包装类的对象值number1与number2的大小；若两者相等，这返回0；
		 * 若前者小于后者，则返回一个负数；若前者大于后者，则返回一个正数。
		 */
		int a = number.compareTo(7.38); //比较5.34和7.38的大小
		int b = number.compareTo(5.34); //比较5.34和5.34的大小
		int c = number.compareTo(2.62); //比较5.34和2.62的大小
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("number=" + number);
		System.out.println("int(number)=" + number.intValue()); //输出number的int型值
		Double number1 = 5.64;
		System.out.println("number1=" + number1);
		
		//intValue()方法将Double型数据转换为Integer型数据时，直接取该Double数据的整数部分
		System.out.println("int(number1)=" + number1.intValue()); //返回对象值number1所对应的int形式
	}

}
