package day03;

import java.util.Random;
import java.util.Scanner;

//�����ִ�С
public class Learn {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����룺");
		int a=scanner.nextInt();	
		Random random=new Random();
		int s=random.nextInt(101);
		System.out.println("���ɵ�����Ϊ��"+s);
		if(a>s){
			System.out.println("Sorry,��´���");
		}
		else {
			System.out.println("Sorry,���С��");
		}
	}

}
