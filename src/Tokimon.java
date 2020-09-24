
public class Tokimon
{
	private String name;
	private String type;
	private double height;
	private double weight;
	private int strength;
	
	//Constructor
	public Tokimon()
	{
		this.name = "unkown";
		this.type = "unkown";
		this.height = 0;
		this.weight = 0;
		this.strength = 0;
	}
	
	//Parameterized Constructor
	public Tokimon(String name, String type, double height, double weight)
	{
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.strength = 0;
	}

	//Method to get name of tokimon
	public String getName()
	{
		return name;
	}

	//Method to set name of tokimon
	public void setName(String name)
	{
		this.name = name;
	}

	//Method to get type of tokimon
	public String getType()
	{
		return type;
	}

	//Method to set type of tokimon
	public void setType(String type)
	{
		this.type = type;
	}

	//Method to get height of tokimon
	public double getHeight()
	{
		return height;
	}

	//Method to set height of tokimon
	public void setHeight(double height)
	{
		this.height = height;
	}

	//Method to get weight of tokimon
	public double getWeight()
	{
		return weight;
	}

	//Method to set weight of tokimon
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	//Method to get strength of tokimon
	public int getStrength()
	{
		return strength;
	}

	//Method to set strength of tokimon
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	//Method to increase strength of tokimon
	public void increaseStrength(int strength)
	{
		this.strength += strength;
	}
	
	//Method to display info of tokimon
	@Override
	public String toString()
	{
		return "Name: " + this.name + "\nType: " + this.type + "\nHeight: " 
				+ this.height + "\nWeight: " + this.weight + "\nStrength: " + this.strength;
	}
}
