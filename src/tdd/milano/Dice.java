package tdd.milano;

public class Dice
{
	private final int value;

	public static Dice create(int value)
	{
		return new Dice(value);
	}
	
	private Dice(int value) {
		super();
		this.value = value;
	}
	
	public boolean matchValue(int value)
	{
		return this.value == value;
	}
	

}
