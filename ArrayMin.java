/*����һ������Ϊ5������
 *Ȼ�������ÿһλ�����������
 *ͨ��ѭ�����������飬�ҳ���С��һ��ֵ���� */

public class ArrayMin{
	public static void main(String[] args){
		int [] a = new int[5];
		// Math.random()��õ�һ��0-1�ĸ�������Ȼ�����100����ת��Ϊ���ͼ���
		a[0] = (int)(Math.random() * 100);
		a[1] = (int)(Math.random() * 100);
		a[2] = (int)(Math.random() * 100);
		a[3] = (int)(Math.random() * 100);
		a[4] = (int)(Math.random() * 100);
	
		System.out.println("�����и�λ���ֵ�ǣ�");
		for(int i = 0;i < a.length; ++i)
			System.out.println(a[i]);
		//�ҳ������е���Сֵ,ð������
		//�����ܸı�����a�ĵ�����������������a��ֵ������b��Ȼ��������b��������
		int temp = 0;
		//�����±� = ���鳤�� - 1
		for(int i = 0;  i< a.length-1; ++i){
			for(int j = 0; j<a.length-1-i; ++j){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

		}
			
		System.out.println("��Сֵ��:"+a[0]);		

	}
}