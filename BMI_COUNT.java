import java.util.Scanner;

public class BMI_COUNT {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("����������ߣ�m���� ");
		double tall = scanner.nextDouble();
		System.out.println("������������(kg)��");
		int weight = scanner.nextInt();
		
		double bmi_result = bmi_count(tall,weight);
		System.out.println("����ǰ��BMI�ǣ�"+bmi_result);
		bmi_lank(bmi_result);
	}
	
	public static double bmi_count(double tall,int weight){
		return weight/(tall*tall);
	}
	
	public static void bmi_lank(double bmi_result){
		if (bmi_result < 18.5)
			System.out.println("���ع��ᰡ�ܵܣ�");
		else if(bmi_result < 24)
			System.out.println("������������������֣�");
		else if(bmi_result < 27)
			System.out.println("���ع��ذ��ܵܣ�");
		else if(bmi_result < 30)
			System.out.println("��ȷ��֣�ע���˰���");
		else if(bmi_result < 35)
			System.out.println("�жȷ��֣�ע���˰�����");
		else
			System.out.println("���棺���Ѿ��ضȷ��֣�");
	}
}