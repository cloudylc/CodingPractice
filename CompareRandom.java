/* @比较两种随机选取5-10数字作为数组长度的方法
***@第一种的是网上的，第二种是自己想的。
***@第一种不加1不能取到10，加1不能取到5，第二种原来不加1不能取到10，加1后能取5-10的数。
**/

public class CompareRandom{
	public static void main(String[] args){	
		int num_1;
		int n5 = 0;int n6 = 0;
		int n7 = 0;int n8 = 0;
		int n9 = 0;int n10 = 0;
		for(int a = 0; a < 50; ++a){
			num_1 = (int)(Math.random()*5+6);
			switch(num_1){
			case 5:++n5;break;
			case 6:++n6;break;
			case 7:++n7;break;
			case 8:++n8;break;
			case 9:++n9;break;
			case 10:++n10;break;
			}
		}
		System.out.print("5:"+" ");
		for(int i = 0;i<n5;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("6:"+" ");
		for(int i = 0;i<n6;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("7:"+" ");
		for(int i = 0;i<n7;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("8:"+" ");
		for(int i = 0;i<n8;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("9:"+" ");
		for(int i = 0;i<n9;++i)
			System.out.print("*");
		System.out.println(); 
		System.out.print("10:"+" ");
		for(int i = 0;i<n10;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------"); 
		int num_2;
		int m5 = 0;int m6 = 0;
		int m7 = 0;int m8 = 0;
		int m9 = 0;int m10 = 0;
		for(int a = 0; a < 50; ++a){
			while(true){
				num_2 = (int)(Math.random() * 10 + 1);
				if(num_2 >= 5)
					break;
			}
			switch(num_2){
			case 5:++m5;break;
			case 6:++m6;break;
			case 7:++m7;break;
			case 8:++m8;break;
			case 9:++m9;break;
			case 10:++m10;break;
			}
		}
		System.out.print("_5:"+" ");
		for(int i = 0;i<m5;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("_6:"+" ");
		for(int i = 0;i<m6;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("_7:"+" ");
		for(int i = 0;i<m7;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("_8:"+" ");
		for(int i = 0;i<m8;++i)
			System.out.print("*"); 
		System.out.println();
		System.out.print("_9:"+" ");
		for(int i = 0;i<m9;++i)
			System.out.print("*");
		System.out.println(); 
		System.out.print("_10:"+" ");
		for(int i = 0;i<m10;++i)
			System.out.print("*"); 
		System.out.println();
		
		

		
	}
}