package programming3;

public class Vehicle {

	private String Name;
	private String Color;
	private String Type;
	private String Region;
	private int Number;
	
	public Vehicle(String name, String color, String type, String region, int number) {
		
		Name = name;
		Color = color;
		Type = type;
		Region = region;
		Number = number;
	}
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getRegion() {
		return Region;
	}


	public void setRegion(String region) {
		Region = region;
	}


	public int getNumber() {
		return Number;
	}


	public void setNumber(int number) {
		Number = number;
	}


	public Vehicle()
	{
		
		// TODO Auto-generated constructor stub
	}


	


	@Override
	public String toString() {
		return String.format("%s%s%s%s%d", Name,Color,Type,Region,Number);
		/*return "Vehicle [Name=" + Name + ", Color=" + Color + ", Type=" + Type + ", Region=" + Region + ", number="
				+ Number + "]";*/
	}
	
	
}
