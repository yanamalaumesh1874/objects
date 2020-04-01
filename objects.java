class object 
{
	int a=9;
	int b=10;
	float c=10.0f;

	public static void main(String[] args) 
	{
		object obj=new object();
		obj.a=10;
		obj.b=12;
        obj.c=12.0f;
		float d=obj.a+obj.b+obj.c;
		System.out.println(d);
	}
}
