/*��������Ϊ5������
 *��������
 *���е���		*/

public class ArrayReverse {
	public static void main(String[] args){
		int [] a = new int [5];
		//�����ֵ
		for(int i = 0;i < a.length; ++i)
			a[i] = (int)(Math.random() * 100);
		//��ӡ����
		for(int i = 0;i < a.length; ++i)
			System.out.print(a[i]+" ");
		//����
		int temp = 0;
		for(int i = 0;i< a.length/2; ++i){
			temp = a[i];
			a[i]=  a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		//��ӡ���ú�����飬ʹ����ǿ��forѭ��
		System.out.print("\n���ú��������Ϊ��\n");
		for(int each : a)
			System.out.print(each+" ");
		
		/*for(int i = 0; i<a.length; ++i)
			System.out.println(a[i]); */
		
		
	}
}