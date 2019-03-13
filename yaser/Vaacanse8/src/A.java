
	

    abstract class A {
	abstract void decrire();
	public String toString()
	{
	return "je suis A : ";
	}
	}
	class B extends A
	{
	void decrire()
	{
	System.out.println(this + "je suis B la fille de A");
	}
	}
	class C extends A
	{
	void decrire()
	{
	System.out.println(this + "je suis C la fille de A");
	}
	
	
	public static void main(String[] arg) throws Exception
	{
	A [] table= new A [5];
	int i = 0;
	
	table[0] = new B();
	table[1] = new C();
	table[2] = new C();
	table[3] = new B();
	table[4] = new C();
	for (i = 0; i < 5; i++)
	table[i].decrire();
	
	}
	}
	
	
	
	
	