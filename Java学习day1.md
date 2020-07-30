# Java学习day1

输入：

Scanner in = new Scanner(System.in);

int variable = in.nextInt();



输出：

不同数据类型用 + 连接

System.out.println("Hello World! " + 123);



数据类型转换：

前面的(int)只能转换后一个值的数据类型，相当于单目运算符，优先级高

(int)((1+4)/2)



关系符号优先级：

6>5>4  ---> 报错，因为先运算6>5，结果为true，true>4不成立

a == b > false ---> 报错，先运算b>false，不能这么比较，同时false和true也不能比较

5 == 5.0 ---> true



else总是和最近的if匹配

所以最好总是加上{}



程序中最好单一出口 —— 只有一个输出，判断之后不直接输出，通过传参，最后输出参数



if-else结构中if和else一定不加；



switch-case结构中，default为若输入不是case的任何一种情况则执行，若case见没有break则顺序执行直到break



如果没有先决条件可以用do-while结构



int类型占4-byte字节，可以表示[2^31^ - 1,  -2^31^]



for可以完全转化为while，初始条件放到while循环前，终止条件为while的终止条件，每步操作放到while循环体中的最后一步



如果有固定次数，用for

如果必须执行一次，用do-while

其他情况用while



break和continue:

再循环前可以放一个labe(标号)来表示循环 ---> OUT:  内层循环想跳出到label处 ---> break OUT;



数组：

int[] numbers = new int[100];

int[] numbers = {1,2,3,4,5,6,7,8,9,10};

创建(new)100个int类型的数组



for-each结构：

for(int k : list){} ---> for k in list:



