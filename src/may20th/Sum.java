package may20th;

public class Sum {
	
	public void add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	
	public void add(int x,int y,int z)
	{
		System.out.println("sum is "+(x+y+z));
	}
	
	public void add(int... a)
	{
		System.out.println("No of items "+a.length);
		// 10,20,30
		int res=0;
		
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}

}
