package day03;

public class IfDemo {
public static void main(String[] args) {
	int score=85;
	if(score>90)
		System.out.println("y ");
	else if(score>80)
		System.out.println("z");
	else {
		System.out.println("c");
	}
	//IF和三元运算符
	int i=5;
	int j=6;
	int k=i>6?i:j;
	System.out.println(k);
	
	
}
}
