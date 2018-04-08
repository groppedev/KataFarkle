package tdd.milano.application;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tdd.milano.domain.DiceGameService;
import tdd.milano.domain.GameScore;
import tdd.milano.domain.Player;

public class DiceGameLauncher implements service
{
	public static void main(String[] args) throws ParseException 
	{
		AbstractApplicationContext context = context();
		try
		{
			DiceGameService service = diceGameService(context);
			GameScore score = service.play(aPlayer(args));
			System.out.println(score);
		}
		finally
		{
			context.close();
		}
	}

	private static Player aPlayer(String[] args) throws ParseException 
	{
		CommandLine cmd = parseArgs(args);
		Player player = new Player(cmd.getOptionValue("playerName"), cmd.getOptionValue("playerSurname"));
		return player;
	}

	private static CommandLine parseArgs(String[] args) throws ParseException 
	{
		final Options options = new Options();
		options.addOption(Option.builder("playerName")
				.argName("playerName")
				.hasArg()
				.desc("Name of the dice game player")
				.build());
		options.addOption(Option.builder("playerSurname").argName("playerSurname")
				.hasArg()
				.desc("Surname of the dice game player")
				.build());
		return new DefaultParser().parse(options, args);
	}

	private static DiceGameService diceGameService(AbstractApplicationContext context) 
	{
		return context.getBean("tdd.milano.diceGameService", DiceGameService.class);
	}

	private static AbstractApplicationContext context() 
	{
		return new ClassPathXmlApplicationContext("injector-config.xml");
	}
}
