public class Millionaire{
	public static void main(String[] args){
		int F = 0; //最终收入
		int p = 12000; //一年的本金
		float r = 0.2f; //年利率
		float r_s = 1.0f;
		int n = 0; //存的年数；
		int target = 1000000;
		for(int i = 1;i<100;++i){
			r_s *= (1+r);
			F += p * r_s;
			n = i;
			System.out.println("第"+n+"年的总收益为："+F);
			if(F >= target)
				break;
		}
		System.out.println("所以一共需要"+n+"年");
			
	}
}