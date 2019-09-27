import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个需要阶乘的整数：");
		int a = scanner.nextInt();
		int b = a;
		int c = 1;
		
		while(a > c)
		{
			b *= c;
			++c;
		}
		System.out.println(a+"的阶乘结果为："+b);
	}
}

