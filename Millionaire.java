public class Millionaire{
	public static void main(String[] args){
		int F = 0; //��������
		int p = 12000; //һ��ı���
		float r = 0.2f; //������
		float r_s = 1.0f;
		int n = 0; //���������
		int target = 1000000;
		for(int i = 1;i<100;++i){
			r_s *= (1+r);
			F += p * r_s;
			n = i;
			System.out.println("��"+n+"���������Ϊ��"+F);
			if(F >= target)
				break;
		}
		System.out.println("����һ����Ҫ"+n+"��");
			
	}
}