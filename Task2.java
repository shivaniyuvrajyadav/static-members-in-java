class Task2 
{
	static double a;
	static int b;
	public static void qsp()
	{
		System.out.println("qsp B");
		System.out.println(a);
        System.out.println(b);
		a = 13.4;
		b = 4;
		System.out.println("qspe");
	}
	public static void jsp()
	{
		System.out.println("Jsp B");
		a = 56.9;
		b = 20;
		System.out.println(a);
		System.out.println(b);
		qsp();
		System.out.println("JSPE");
	}
	static
	{
		System.out.println("Sib-1");
			qsp();
	}
	public static void main(String[] args) 
	{
		System.out.println("MB");
		jsp();
		int a = 3;
		int b = 90;
		System.out.println(Task2.a);
		System.out.println(a);
		System.out.println(b);
		System.out.println("ME");
	}
	static
	{
		System.out.println("SIB - 2");
	}
}
