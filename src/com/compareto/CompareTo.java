package com.compareto;

public class CompareTo {

	public static void main(String[] args) {
		Double number = 5.34;
		
		/*
		 * public int compareTo(number1 number2)
		 * �Ƚϵ��ø÷����İ�װ��Ķ���ֵnumber1��number2�Ĵ�С����������ȣ��ⷵ��0��
		 * ��ǰ��С�ں��ߣ��򷵻�һ����������ǰ�ߴ��ں��ߣ��򷵻�һ��������
		 */
		int a = number.compareTo(7.38); //�Ƚ�5.34��7.38�Ĵ�С
		int b = number.compareTo(5.34); //�Ƚ�5.34��5.34�Ĵ�С
		int c = number.compareTo(2.62); //�Ƚ�5.34��2.62�Ĵ�С
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("number=" + number);
		System.out.println("int(number)=" + number.intValue()); //���number��int��ֵ
		Double number1 = 5.64;
		System.out.println("number1=" + number1);
		
		//intValue()������Double������ת��ΪInteger������ʱ��ֱ��ȡ��Double���ݵ���������
		System.out.println("int(number1)=" + number1.intValue()); //���ض���ֵnumber1����Ӧ��int��ʽ
	}

}
