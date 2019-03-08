import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		public Scanner userInput;
		public int week;
		public Team homeTeam;
		public Team awayTeam;
		
		public Game(int w, Team h, Team a)
			{
				week = w;
				homeTeam = h;
				awayTeam = a;
			}
		public int getWeek()
			{
				return week;
			}
		public void setWeek(int week)
			{
				this.week = week;
			}
		public Team getHomeTeam()
			{
				return homeTeam;
			}
		public void setHomeTeam(Team homeTeam)
			{
				this.homeTeam = homeTeam;
			}
		public Team getAwayTeam()
			{
				return awayTeam;
			}
		public void setAwayTeam(Team awayTeam)
			{
				this.awayTeam = awayTeam;
			}
	}

