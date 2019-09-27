/*创建长度为5的数组
 *填充随机数
 *进行倒置		*/

public class ArrayReverse {
	public static void main(String[] args){
		int [] a = new int [5];
		//随机赋值
		for(int i = 0;i < a.length; ++i)
			a[i] = (int)(Math.random() * 100);
		//打印数组
		for(int i = 0;i < a.length; ++i)
			System.out.print(a[i]+" ");
		//倒置
		int temp = 0;
		for(int i = 0;i< a.length/2; ++i){
			temp = a[i];
			a[i]=  a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		//打印倒置后的数组，使用增强型for循环
		System.out.print("\n倒置后的新数组为：\n");
		for(int each : a)
			System.out.print(each+" ");
		
		/*for(int i = 0; i<a.length; ++i)
			System.out.println(a[i]); */
		
		
	}
}