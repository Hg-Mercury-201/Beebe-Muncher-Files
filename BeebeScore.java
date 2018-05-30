
public class BeebeScore 
{
	private int score = 0;
	
	public BeebeScore(int s)
	{
		score = s;
	}
	public int getScore()
	{
		return score;
	}
	public void scorePoint()
	{
		score++;
	}
	public void losePoint()
	{
		score--;
	}
	public void reset()
	{
		score = 0;
	}
}
