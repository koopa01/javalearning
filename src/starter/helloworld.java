package starter;

import java.util.Scanner;

public class helloworld {

//	函数
	public static void f()
	{
		System.out.println("f()");
//		函数最好不要有多个出口——return
	}
	
	
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
		 
//		字符类型
//		char c = 'A';//char类型仅为一个字符，所以可以用单引号，多个字符需要使用String类型，以及双引号
//		char c = '\u0041';//unicode编码
//		char c = 65;
		char c = 'A';//大写A 换成小写a 放到e里
		char e = (char)(c + 'a' - 'A');//单个字符可以比较大小
		c++;
		int i = 'Z' - 'a';
		char d = '汉';
		System.out.println(c);//输出B
		System.out.println(i);
		System.out.println(d-1);//27720 unicode表中的‘汉’前一个字的编码
		System.out.println((int)c);//A的ASCII码
		System.out.println(e);
		//\b 回退一格，\t 下一个表格位， \n 换行， \r 回车，\" 双引号 \\反斜杠本身
		
//		包裹类型 - 包裹工具
//		boolean - Boolean
//		char - Character
//		int - Integer
//		double Double
		int f = 10;//4字节，32bit
		Integer k = 29;
		f = k;
		System.out.println(Integer.MAX_VALUE);//[-2^31 , 2^31 - 1]
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.toLowerCase('A'));
		
//		Math类
		System.out.println(Math.abs(-10));
		System.out.println(Math.round(10.345));//四舍五入
		System.out.println(Math.random()*100);//0-100间的一个随机数
		System.out.println(Math.pow(2, 3));//2的3次方，返回浮点数，2和3都可以是浮点数
		
//		字符串String 1.首字母大写表示其为一个类，但不一定是包裹类型 2.字符串类型不可修改，方法都是在创建新字符串之上修改
		String s1  = new String("我是字符串123454321");//完整过程，由于String为一个类，所以需要用“我是字符串”初始化这个类，并创建管理变量s，并由s管理这个对象
		String t1 = "我也是字符串";
		System.out.println(s1+12+24);//"我是字符串1224" 字符串类遇到int会转换int至字符串
		in.next();//读入一个单词，单词标志是空格或tab或换行
		in.nextLine();//读入一整行
		//注意：
		if(s1 == "bye") {} //比较是否指向同一个对象
		if(t1.equals("bye")) {}//比较内容是否相同
		s1.compareTo("abc");//比较两个字符串大小结果为负/正/0
		s1.compareToIgnoreCase("abc");//不区分大小写的比较两个字符串大小
		s1.charAt(0);//字符串中的某个元素，用索引
		s1.substring(2,4);//切片 s1[2:4]
		s1.indexOf("我");//寻找“我”所在字符串中的位置，-1表示不存在
		s1.indexOf("我",2);//从2号位置开始找“我”
		int loc = s1.indexOf("3");
		s1.indexOf("3",loc+1);//如果字符串中两次出现“3”，找到第二次出现的“3”
		s1.lastIndexOf("3");
		s1.startsWith("我是");
		s1.endsWith("321");
		s1.trim();
		s1.replace("串", "结构");
//		switch case("This") 只在1.6以上版本中允许使用
		
//		函数
		f();
		
//		解决"in" is never closed问题
		in.close();
	}
}
