package tdd.milano.domain;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;

public class DiceGame implements Iterable<Dice>
{	
	private final class PredicateValue implements Predicate<Dice> 
	{
		private final int valueCompare;

		public PredicateValue(int valueCompare) {
			super();
			this.valueCompare = valueCompare;
		}
		
		public boolean evaluate(Dice dice) 
		{
			return dice.matchValue(this.valueCompare);
		}
	}


	private final Dice[] dices;

	public DiceGame(Dice d1, Dice d2, Dice d3, Dice d4, Dice d5)
	{
		this.dices = new Dice[] {d1, d2, d3, d4, d5};
	}
	

	public Iterator<Dice> iterator()
	{
		return Arrays.asList(dices).iterator();
	}
	
	
	public GameScore calculate()
	{
		int result = 0;
		long matches1 = IterableUtils.countMatches(this, new PredicateValue(1));
		result = (int) (matches1 * 100);
		
		long matches5 = IterableUtils.countMatches(this, new PredicateValue(5));
		result += (int) (matches5 * 50);

		
		
		for(int i = 0; i<6; i++)
		{
			
		}
		
		return new GameScore(result);
	}
	
}
