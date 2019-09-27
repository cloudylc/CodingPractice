public class BuggerMoney {
	public static void main(String[] args){
		int each_day_money = 0;
		int sum_money = 0;
		for(int i = 1; i<11; ++i){
			if(0 == each_day_money)
				each_day_money = 1;
			else
				each_day_money *= 2;
			sum_money += each_day_money;
			System.out.println("第"+i+"天的钱加起来有"+sum_money);
		}
		int sum = 0;
		int a = 1;
		for (int i = 0; i < 10; i++) {
			sum += a<<i;
			
			
		}
		System.out.println("洪爷工资为"+sum);
	}
}