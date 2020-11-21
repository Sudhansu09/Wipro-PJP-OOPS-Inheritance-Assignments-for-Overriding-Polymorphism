class Orange extends Fruit
{
	Orange(String name,String taste,int size)
	{
		super(name,taste,size);
	}
	public void eat()
	{
		super.eat();
		System.out.println("The size of "+getName()+" is "+getSize());
	}
}