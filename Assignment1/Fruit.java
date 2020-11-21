class Fruit
{
	private String name;
	private String taste;
	private int size;

	public Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public String getName()
	{
		return name;
	}
	public String getTaste()
	{
		return taste;
	}
	public int getSize()
	{
		return size;
	}
	public void eat()
	{
		System.out.println(getName()+" taste like "+getTaste());
	}
}