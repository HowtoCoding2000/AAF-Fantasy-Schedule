import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		public Scanner userInput;
		public int week;
		public Team homeTeam;
		public Team awayTeam;
		public boolean winnerPredicted;
		public boolean homeTeamPredicted;
		public Game(int w, Team h, Team a, boolean p, boolean hP)
			{
				week = w;
				homeTeam = h;
				awayTeam = a;
				winnerPredicted = p;
				homeTeamPredicted = hP;
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
		public boolean isWinnerPredicted()
			{
				return winnerPredicted;
			}
		public void setWinnerPredicted(boolean winnerPredicted)
			{
				this.winnerPredicted = winnerPredicted;
			}
		public boolean isHomeTeamPredicted()
			{
				return homeTeamPredicted;
			}
		public void setHomeTeamPredicted(boolean homeTeamPredicted)
			{
				this.homeTeamPredicted = homeTeamPredicted;
			}
		
	}

