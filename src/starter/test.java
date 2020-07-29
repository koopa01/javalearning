package starter;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入一个数，判断是否为素数：");
		int jishu = 0;
		int shu = 2;
		do
		{
			int is_prime = 1;
			for ( int i=2; i<shu; i++)
			{
				if(shu % i == 0)
				{
					is_prime = 0;
//					System.out.println("有因子"+i);
					break;
				}
			}
			if(is_prime == 1)
			{
				System.out.print(shu + " ");
				jishu++;
			}
			shu++;
		}while(jishu<50);
		
		in.close();
	}
}
