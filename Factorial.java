import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����Ҫ�׳˵�������");
		int a = scanner.nextInt();
		int b = a;
		int c = 1;
		
		while(a > c)
		{
			b *= c;
			++c;
		}
		System.out.println(a+"�Ľ׳˽��Ϊ��"+b);
	}
}

