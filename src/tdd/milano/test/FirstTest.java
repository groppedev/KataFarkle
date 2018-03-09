package tdd.milano.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import tdd.milano.Dice;
import tdd.milano.DiceGame;
import tdd.milano.GameScore;

@SuppressWarnings("static-method")
@RunWith(JUnit4.class)
public class FirstTest 
{
	
	// Fixture.
	private static final Dice dice1 = Dice.create(1);
	private static final Dice dice2 = Dice.create(2);
	private static final Dice dice3 = Dice.create(3);
	private static final Dice dice4 = Dice.create(4);
	private static final Dice dice5 = Dice.create(5);
	private static final Dice dice6 = Dice.create(6);
	
	@Test
	public void score200Test()
	{
		// Run Test.
		DiceGame game = new DiceGame(dice5, dice6, dice1, dice2, dice5);
		GameScore score = game.calculate();
		
		Assert.assertEquals(new GameScore(200), score);
	}
	

	@Test
	public void score1300Test()
	{
		// Run Test.
		DiceGame game = new DiceGame(dice6, dice6, dice6, dice6, dice1);
		GameScore score = game.calculate();
		
		Assert.assertEquals(new GameScore(1300), score);
	}
}
