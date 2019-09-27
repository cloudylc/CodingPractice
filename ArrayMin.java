/*创建一个长度为5的数组
 *然后给数组每一位赋予随机整数
 *通过循环，遍历数组，找出最小的一个值出来 */

public class ArrayMin{
	public static void main(String[] args){
		int [] a = new int[5];
		// Math.random()会得到一个0-1的浮点数，然后乘以100，并转化为整型即可
		a[0] = (int)(Math.random() * 100);
		a[1] = (int)(Math.random() * 100);
		a[2] = (int)(Math.random() * 100);
		a[3] = (int)(Math.random() * 100);
		a[4] = (int)(Math.random() * 100);
	
		System.out.println("数组中各位随机值是：");
		for(int i = 0;i < a.length; ++i)
			System.out.println(a[i]);
		//找出数组中的最小值,冒泡排序
		//若不能改变数组a的的情况下排序，则把数组a赋值给数组b，然后用数组b进行排序
		int temp = 0;
		//数组下标 = 数组长度 - 1
		for(int i = 0;  i< a.length-1; ++i){
			for(int j = 0; j<a.length-1-i; ++j){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}
			
		System.out.println("最小值是:"+a[0]);		

	}
}