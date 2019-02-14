import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		protected Scanner userInput = new Scanner(System.in);
		protected int week;
		protected Team homeTeam;
		protected Team awayTeam;
		public Game(int w, Team h, Team a)
			{
				week = w;
				homeTeam = h;
				awayTeam = a;
			}
		public static void addNewGame()
		{
			System.out.println("Who is the home team?");
			int i = 0;
			for(Team t: FantasySchedule.teams)
				{
					System.out.println("(" + (i + 1) + ")" + FantasySchedule.teams.get(i).getName());
					i++;
				}
		}
	}

