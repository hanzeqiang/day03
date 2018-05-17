package day03;
/*
 * 循环嵌套
 * for(){
 * for()}
 * 外循环控制行，内循环控制列
 */
public class ForForDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
				}
			System.out.println("1");
		}
	}

}
