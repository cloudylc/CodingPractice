import java.util.Scanner;

public class BMI_COUNT {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("输入您的身高（m）： ");
		double tall = scanner.nextDouble();
		System.out.println("输入您的体重(kg)：");
		int weight = scanner.nextInt();
		
		double bmi_result = bmi_count(tall,weight);
		System.out.println("您当前的BMI是："+bmi_result);
		bmi_lank(bmi_result);
	}
	
	public static double bmi_count(double tall,int weight){
		return weight/(tall*tall);
	}
	
	public static void bmi_lank(double bmi_result){
		if (bmi_result < 18.5)
			System.out.println("体重过轻啊弟弟！");
		else if(bmi_result < 24)
			System.out.println("体重正常，请继续保持！");
		else if(bmi_result < 27)
			System.out.println("体重过重啊弟弟！");
		else if(bmi_result < 30)
			System.out.println("轻度肥胖，注意了啊！");
		else if(bmi_result < 35)
			System.out.println("中度肥胖，注意了啊！！");
		else
			System.out.println("警告：你已经重度肥胖！");
	}
}