/*@����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
**@�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
*/

public class DoubleArray{
	public static void main(String[] args){
		int [][] a = new int [5][5];
		for(int i = 0;i < a.length; ++i){
			for(int j = 0; j<a[0].length; ++j)
				a[i][j] = (int)(Math.random() * 100);
		
		}
		//�����ֵ
		for(int i = 0; i<a.length; ++i)
			for(int j = 0; j<a[0].length; ++j){
				System.out.print(a[i][j] +" ");	
				if(j == a[0].length-1)
					System.out.println();
			}
		//����һ��һά����
		int [] b = new int[25];
		//for(int i = 0; i < a.length; ++i)
			//for(int j = 0; j<a[0].length; ++j)
		System.arraycopy(a,00,b,0,a.length);
		for(int each : b)
			System.out.println(each);
	}
}