import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("输入您想查询的月份：");
		int month = scanner.nextInt();
		String season;
		switch(month) {
			case 2:
			case 3:
			case 4:
				season = "春季";
				break;
			case 5:
			case 6:
			case 7:
				season = "夏季";
				break;
			case 8:
			case 9:
			case 10:
				season = "秋季";
				break;
			case 11:
			case 12:
			case 1:
				season = "冬季";
				break;
			default:
				season = "你输入的是什么东西？";
		}
		System.out.println(season);
	}
}
		
