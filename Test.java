public class Test{
	public static void main(String[] args){
		int [][] a = new int [60][60];
		for(int k = 0; k < 1000; ++k){
			for(int i = 0;i < a.length; ++i){
				for(int j = 0; j<a[0].length; ++j)
					a[i][j] = (int)(Math.random() * 100);
			}
			for(int i = 0; i<a.length; ++i)
				for(int j = 0; j<a[0].length; ++j){
					System.out.print(a[i][j] +" ");	
					if(j == a[0].length-1)
						System.out.println();
				}
		}
	}`	
}