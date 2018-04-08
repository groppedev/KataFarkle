package tdd.milano.domain;

public class DiceGameService 
{
	private final IDiceGamesRepository repo;
	
	public DiceGameService(IDiceGamesRepository repo) 
	{
		this.repo = repo;
	}

	public GameScore play(Player player)
	{
		return null;
	}
}
