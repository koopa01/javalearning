package starter;

public class Table_of_nine_times_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		九九乘法表
		for(int i=1; i<10; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("\t" + i + "*" + j + "=" + i*j);
			System.out.println();
		}
	}

}
