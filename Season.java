import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������ѯ���·ݣ�");
		int month = scanner.nextInt();
		String season;
		switch(month) {
			case 2:
			case 3:
			case 4:
				season = "����";
				break;
			case 5:
			case 6:
			case 7:
				season = "�ļ�";
				break;
			case 8:
			case 9:
			case 10:
				season = "�＾";
				break;
			case 11:
			case 12:
			case 1:
				season = "����";
				break;
			default:
				season = "���������ʲô������";
		}
		System.out.println(season);
	}
}
		
