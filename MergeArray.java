/* ׼���������飺������5-10֮������������ʹ���������  * ʼ������������飬������������ϲ���������������ȥ
 * ʹ��System.copy�������кϲ�*/

public class MergeArray{
	public static void main(String[] args){
		// �����������Ϊ5-10������Ϊ�����ϲ�����ĳ���,+1����ȡ��10
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
		//��ʼ���������������飻
		int length_3 = random_length_1 + random_length_2;
		int [] Array_1 = new int [random_length_1];
		int [] Array_2 = new int [random_length_2];
		int [] Array_3 = new int [length_3];
		
		//������������
		for(int i = 0;i<Array_1.length;++i){
			Array_1 [i] =(int)(Math.random() * 100);
		}
		for(int i = 0;i<Array_2.length;++i){
			Array_2 [i] =(int)(Math.random() * 100);
		}
		//��ӡ��������
		System.out.println("��һ����������ݣ�");
		for(int each : Array_1)
			System.out.print(each+" ");
		System.out.println("\n�ڶ�����������ݣ�");
		for(int each : Array_2)
			System.out.print(each+" ");
		//�ϲ���������
		System.out.println("\n��������ϲ������ݣ�");
		System.arraycopy(Array_1,0,Array_3,0,random_length_1);
		System.arraycopy(Array_2,0,Array_3,random_length_1,random_length_2);
		for(int each : Array_3)
			System.out.print(each+" ");

	}
}