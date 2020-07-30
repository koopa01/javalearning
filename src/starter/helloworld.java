package starter;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		System.out.println("Hello world!你好");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
		System.out.println(2+3+"=2+3="+(2+3));
		
//		输入输出练习
		System.out.println("请输入面值:");
		int amount = in.nextInt();
		System.out.println("请输入价格:");
		int price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount-price));
		
//		double不精确
		double a = 1.0;
		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println("a=" + a + ",b=" + b);
		System.out.println(Math.abs(a-b) < 1e-6);
		
//		英寸和米的转化
		System.out.println("请输入身高,单位为英尺:");
//		Scanner in = new Scanner(System.in);
		int foot = in.nextInt();
		int inch = in.nextInt();
		System.out.println("身高为:" + (int)((foot + inch / 12.0) * 30.48)+"cm");

//		地铁售票问题
//		Scanner in = new Scanner(System.in);
		int balance = 0;
		while (balance != 1)
//		while (true)
		{
			System.out.println("请投币:");
			int coin = in.nextInt();
			balance = balance + coin;
//			System.out.println(balance);
//			System.out.println(balance >= 10);
			if(balance >= 10) 
			{
				System.out.println("*****************");
				System.out.println("*Java城际铁路专线*");
				System.out.println("*  无指定座位票    *");
				System.out.println("*    票价:10元      *");
				System.out.println("*****************");
				System.out.println("找零: " + (balance-10) + "元");
				balance = 0;
			}
			else
			{
				System.out.println("金额不够,当前投入 "+balance+" 元,请补齐 "+(10-balance)+" 元");
			}
		}
		
//		switch-case语句
//		default为 若输入不是case的任何一种情况则执行
//		若case见没有break则顺序执行直到break
		System.out.println("请输入1-4中任意数字");
		int time = in.nextInt();
		switch(time)
		{
		case 1:
			System.out.println("早上好");
		case 2:
			System.out.println("中午好");
			break;
		case 3:
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊?什么啊?");
			break;
		}
		
//		数数字
		System.out.println("请输入一个数字,我会为你计算其位数:");
		int number = in.nextInt();
		int count = 0;
//		如果输入为0,则进不去while循环体,则需用do-while循环体,先做后判断.
//		用while还是do-while完全取决于有没有先决条件
		do
		{
			number = number / 10;
			count = count + 1;
			System.out.println(number);
			System.out.println(count);
		}while (number > 0);
		System.out.println("这个数是 " + count + "位数");
		
//		用for循环实现阶乘
		int n = in.nextInt();
		int factor = 0;
		for ( int i=1; i<=n; i++ )
		{
			factor = factor * i;
		}
		System.out.println(factor);
		
//		1-100中前50个素数
		System.out.println("输出1-100中前50个素数");
//		int jishu = 0;
//		int shu = 2;
//		do
//		{
//			boolean is_prime = true;
//			for ( int i=2; i<Math.sqrt(shu); i++)
//			{
//				if(shu % i == 0)
//				{
//					is_prime = false;
//					//System.out.println("有因子"+i);
//					break;
//				}
//			}
//			if( is_prime )
//			{
//				System.out.print(shu + " ");
//				jishu++;
//			}
//			shu++;
//		}while(jishu<50);

//		检查每个数都是否为当前查到的所有素数的倍数,若不是则为素数
//		int[] primes = new int[50];
//		primes[0] = 2;
//		int cnt = 1;//既是指向primes数组中的cnt号元素,也指数组中一共有多少个元素
//		MAIN_LOOP:
//		for (int x = 3; cnt<50; x++)
//		{
//			for (int i=0; i<cnt; i++)
//			{
//				if (x % primes[i] == 0)
//				{	
//					continue MAIN_LOOP;
//				}
//			}
//			primes[cnt++] = x;
//		}
//		for(int k : primes)
//		{
//			System.out.print(k + " ");
//		}
		
//		从数列中除去所有当前获得的素数的倍数
//		n = in.nextInt();
		boolean is_prime[] = new boolean[100/* n */];
		for (int i=0; i<is_prime.length; i++)
		{
			is_prime[i] = true;
		}
		for	(int i=2; i<is_prime.length; i++)
		{
			if( is_prime[i] )
			{
				for(int k = 2; i*k<is_prime.length ;k++)
				{
					is_prime[i*k] = false;
				}
			}
		}
		for (int i=2; i<is_prime.length; i++)
		{
			if (is_prime[i])
			{
				System.out.print(i+" ");
			}
		}
		
		
//		数组 -- 计算平均数并输出大于平均数的数字
		int[] nums = new int[100];
		System.out.println(nums.length);
		int x = 0;
		double sum = 0;
		int cnt = 0;
		while (x != -1)
		{
			nums[cnt] = x;
			sum += x;
			cnt ++;
			x = in.nextInt();
		}
		if ( cnt>0 )
		{
			double average = sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if( nums[i] > average )
				{
					System.out.println(nums[i]);
				}
			}
			System.out.println(sum/cnt);
		}
		
//		输入小于10的整数,不限输入次数,判断每个数字输入了多少次
		int indx_x;
		int[] numbs = new int[10];
		indx_x = in.nextInt();
		while (indx_x != -1)
		{
			if (indx_x>=0 && indx_x<=9)
			{
				numbs[indx_x]++;
			}
			indx_x = in.nextInt();
		}
		for (int i=0; i<numbs.length; i++)
		{
			System.out.println(i+":"+numbs[i]);
		}
		
//		二维数组
		int[][] ma = new int[3][5]; // 三行五列的二维数组
		int[][] ma1 = {
				{1,2,3,4},
				{1,2,3},
		};
		System.out.println(ma);
		System.out.println(ma1);
	//井字棋
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
//		boolean gotResult = false;
//		int numOFX = 0;
//		int numOFO = 0;
		System.out.println("You win");
		//读入矩阵
		for(int i=0; i<board.length; i++)
		{
			for (int j=0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		System.out.println(board);
		//检查行
		for (int i=0; i<board.length; i++)
		{
			if(board[i][0] == board[i][1] && board[i][0] == board[i][2])
			{
				System.out.println( board[i][0] + " win" );
				break;
			}
			//检查列
			if(board[0][i] == board[1][i] && board[0][i] == board[2][i])
			{
				System.out.println( board[0][i] + " win" );
				break;
			}
			if(board[0][0] == board[1][1] && board[0][0] == board[2][2])
			{
				System.out.println( board[0][0] + " win" );
				break;
			}
		}
		

		
		
		
		
		
		
		
		
		
		
//		解决"in" is never closed问题
		in.close();
	}
}
