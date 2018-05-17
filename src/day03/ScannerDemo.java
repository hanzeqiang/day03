package day03;
/*
 * 引用数据类型，介绍一个类 Scanner
 * java已经存在，sun公司定义
 * int a =1;
 * 格式：
 * 类型  变量名=new 类型（）；
 * 举例：
 * 创建Scanner累的变量
 * Scanner sc=new Scanner();
 * int a=1;
 * 变量。功能
 */
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		
	
	//Scanner接受键盘输入
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入:");
	int i=sc.nextInt();

	System.out.println(+i);
	//Scanner类的另一个功能  next()接受键盘输入的字符串数据
	
	System.out.println("请输入:");
	String s=sc.next();
	System.out.println(s);
	
	
}
}
