package day03;

import java.util.Random;

/*
 * random�࣬���������
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random random=new Random();
		int s =random.nextInt(3274687);
		System.out.println(s);
		//1-100
		int a=random.nextInt(100);//��Χ0-99
		System.out.println(a+1);
		double b=random.nextDouble();//��Χ0-1.0
		System.out.println(b);
	}

}
