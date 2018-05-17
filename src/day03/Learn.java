package day03;

import java.util.Random;
import java.util.Scanner;

//猜数字大小
public class Learn {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入：");
		int a=scanner.nextInt();	
		Random random=new Random();
		int s=random.nextInt(101);
		System.out.println("生成的数字为："+s);
		if(a>s){
			System.out.println("Sorry,你猜大了");
		}
		else {
			System.out.println("Sorry,你猜小了");
		}
	}

}
