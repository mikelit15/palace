import java.util.*;


public abstract class Animal
{
	String name;
	int numLegs;

	public Animal()
	{
		name = "";
		numLegs = 0;
	}
	
	public Animal(String name, int numLegs)
	{
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLegs()
	{
		return numLegs;
	}
}

