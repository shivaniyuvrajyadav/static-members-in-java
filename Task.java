class Task 
{
	static String a;
	static boolean b;
    public static void sheela()
	{
		System.out.println("sheela b");
		System.out.println(a);
		System.out.println(b);
		a = "leela";
		b = true;
		System.out.println("sheela E");
	}
	static 
		{
		System.out.println("SIB-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("MB");
		sheela();
		System.out.println(a);
		System.out.println(b);
		System.out.println("ME");
	}
	static
	{
		System.out.println("SIB-2");
		sheela();
	}

}
