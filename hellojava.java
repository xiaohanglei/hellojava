class A
{
	private int x;
	private int y;
	
	public A(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;		
	}
	public void show()
	{
		System.out.printf("x = %d, y = %d\n",this.x, this.y);
	}
}
public class hellojava
{
	public static void main(String[] args)
	{
		A xx = new A(3,6);
		xx.show();
	}
}