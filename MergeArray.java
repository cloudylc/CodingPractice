/* 准备两个数组：长度是5-10之间的随机数，并使用随机数初  * 始化这个两个数组，将这两个数组合并到第三个数组中去
 * 使用System.copy方法进行合并*/

public class MergeArray{
	public static void main(String[] args){
		// 生成随机长度为5-10的数作为两个合并数组的长度,+1才能取到10
		int random_length_1;
		int random_length_2;
		while(true){
			random_length_1 = (int)(Math.random() * 10 +1 );
			if(random_length_1 >= 5)
				break;
		}
		while(true){
			random_length_2 = (int)(Math.random() * 10 + 1);
			if(random_length_2 >= 5 && random_length_2 != random_length_1)
				break;
		}
		//初始化并创建两个数组；
		int length_3 = random_length_1 + random_length_2;
		int [] Array_1 = new int [random_length_1];
		int [] Array_2 = new int [random_length_2];
		int [] Array_3 = new int [length_3];
		
		//随机数填充数组
		for(int i = 0;i<Array_1.length;++i){
			Array_1 [i] =(int)(Math.random() * 100);
		}
		for(int i = 0;i<Array_2.length;++i){
			Array_2 [i] =(int)(Math.random() * 100);
		}
		//打印两个数组
		System.out.println("第一个数组的内容：");
		for(int each : Array_1)
			System.out.print(each+" ");
		System.out.println("\n第二个数组的内容：");
		for(int each : Array_2)
			System.out.print(each+" ");
		//合并两个数组
		System.out.println("\n两个数组合并的内容：");
		System.arraycopy(Array_1,0,Array_3,0,random_length_1);
		System.arraycopy(Array_2,0,Array_3,random_length_1,random_length_2);
		for(int each : Array_3)
			System.out.print(each+" ");

	}
}