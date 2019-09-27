/*@定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
**@找出这个二维数组里，最大的那个值，并打印出其二维坐标
*/

public class DoubleArray{
	public static void main(String[] args){
		int [][] a = new int [5][5];
		for(int i = 0;i < a.length; ++i){
			for(int j = 0; j<a[0].length; ++j)
				a[i][j] = (int)(Math.random() * 100);
		
		}
		//随机赋值
		for(int i = 0; i<a.length; ++i)
			for(int j = 0; j<a[0].length; ++j){
				System.out.print(a[i][j] +" ");	
				if(j == a[0].length-1)
					System.out.println();
			}
		//赋给一个一维数组
		int [] b = new int[25];
		//for(int i = 0; i < a.length; ++i)
			//for(int j = 0; j<a[0].length; ++j)
		System.arraycopy(a,00,b,0,a.length);
		for(int each : b)
			System.out.println(each);
	}
}