class counter
{
	private static int c=5;
	counter()
	{
		c++;
	}
	int getCounter()
	{
		return c;
	}
	public static void main(String args[])
	{
		counter ct = new counter();
		System.out.println(ct.getCounter());
		counter ct1 = new counter();
		System.out.println(ct1.getCounter());
		counter ct2 = new counter();
		System.out.println(ct2.getCounter());
	}
}