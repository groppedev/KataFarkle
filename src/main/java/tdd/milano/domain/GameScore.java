package tdd.milano.domain;

public class GameScore 
{
	private final int resultValue;

	public GameScore(int resultValue) 
	{
		super();
		this.resultValue = resultValue;
	}

	public int value() {
		return resultValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + resultValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameScore other = (GameScore) obj;
		if (resultValue != other.resultValue)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GameScore [resultValue=" + resultValue + "]";
	}
	
	
}
