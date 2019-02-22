import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		public static Scanner userInput;
		public static int week;
		public static Team homeTeam;
		public static Team awayTeam;
		public Game(int w, Team h, Team a)
			{
				week = w;
				homeTeam = h;
				awayTeam = a;
			}
		public static void addNewGame()
		{
			boolean addingNewGame = true;
			do
				{
					userInput = new Scanner(System.in);
					int userHomeChoice = 0;
					do
						{
							System.out.println("Who is the home team?");
							int i = 0;
							for(Team t: FantasySchedule.teams)
								{
									System.out.println("(" + (i + 1) + ")" + FantasySchedule.teams.get(i).getName());
									i++;
								}
							userHomeChoice = userInput.nextInt() - 1;
						}
					while(userHomeChoice < 0 || userHomeChoice > FantasySchedule.teams.size() - 1);
					homeTeam = FantasySchedule.teams.get(userHomeChoice);
					int userAwayChoice = 0;
					System.out.println();
					do
						{
							System.out.println("Who is the away team");
							int j = 0;
							int k = 0;
							for(Team t: FantasySchedule.teams)
								{
									if (j != userHomeChoice)
										{
											System.out.println("(" + (k + 1) + ")" + FantasySchedule.teams.get(j).getName());
											j++;
											k++;
										}
									else
										{
											j++;
										}
								}
							userAwayChoice = userInput.nextInt() - 1;
						}
					while(userAwayChoice < 0 || userAwayChoice > FantasySchedule.teams.size() - 1);
					awayTeam = FantasySchedule.teams.get(userAwayChoice);
					System.out.println();
					FantasySchedule.games.add(new Game(FantasySchedule.games.size() + 1,homeTeam, awayTeam));
					System.out.print("Week " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getWeek() + ": ");
					System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getCity() + " " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getName() + " vs ");
					System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getName());
					System.out.println();
					int userChoice = 0;
					do
						{
							System.out.println("Would you like to add another game?");
							System.out.println("(1) Yes");
							System.out.println("(2) No (Return to main menu)");
							userChoice = userInput.nextInt();
							if (userChoice == 2)
								{
									addingNewGame = false;
								}
						}
					while (userChoice != 1 && userChoice != 2);
				}
			while (addingNewGame);
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

