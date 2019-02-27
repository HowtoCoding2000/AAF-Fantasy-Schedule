import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		public static Scanner userInput;
		public static int week;
		public static Team homeTeam;
		public static Team awayTeam;
		public static int userChoice = 0;
		public static int gameIndex = 0;
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
					homeTeam = null;
					awayTeam = null;
					userInput = new Scanner(System.in);
					boolean correctGameInfo = false;
					do
						{
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
									if(userAwayChoice >= userHomeChoice)
										{
											userAwayChoice++;
										}
								}
							while(userAwayChoice < 0 || userAwayChoice > FantasySchedule.teams.size() - 1);
							awayTeam = FantasySchedule.teams.get(userAwayChoice);
							System.out.println();
							FantasySchedule.games.add(new Game(FantasySchedule.games.size() + 1,homeTeam, awayTeam));
//							System.out.println("Week" + FantasySchedule.games.size() + ":");
//							System.out.println(homeTeam);
							System.out.print("Week " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getWeek() + ": ");
							System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getCity() + " " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getName() + " vs ");
							System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getName());
							System.out.println();
							int counter = 0;
							userChoice = 0;
							do
								{
									if (counter > 0)
										{
											System.out.print("Week " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getWeek() + ": ");
											System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getCity() + " " + FantasySchedule.games.get(FantasySchedule.games.size() - 1).getHomeTeam().getName() + " vs ");
											System.out.print(FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(FantasySchedule.games.size() - 1).getAwayTeam().getName());
											System.out.println();
										}
									System.out.println("Is this information correct?");
									System.out.println("(1) Yes");
									System.out.println("(2) No");
									userChoice = userInput.nextInt();
									counter++;
									if (userChoice == 1)
										{
											correctGameInfo = true;
										}
									else if (userChoice == 2)
										{
											FantasySchedule.games.remove(FantasySchedule.games.get(FantasySchedule.games.size() - 1));
										}
									System.out.println();
								}
							while(userChoice != 1 && userChoice != 2);
						}
					while(correctGameInfo == false);
					userChoice = 0;
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
		
		public static void printGameSchedule()
			{
				for (int i = 0; i < FantasySchedule.games.size(); i++)
					{
//						printGame(i);
//						gameIndex = i;
						System.out.print("Week " + FantasySchedule.games.get(i).getWeek() + ": ");
						System.out.print(FantasySchedule.games.get(i).getHomeTeam().getCity() + " " + FantasySchedule.games.get(gameIndex).getHomeTeam().getName() + " vs ");
						System.out.print(FantasySchedule.games.get(i).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(gameIndex).getAwayTeam().getName());
						System.out.println();
					}
				System.out.println("*These are the games that are currently in the system.");
			}
//		public static void printGame(int i)
//			{
//				gameIndex = i;
//				System.out.print("Week " + FantasySchedule.games.get(gameIndex).getWeek() + ": ");
//				System.out.print(FantasySchedule.games.get(gameIndex).getHomeTeam().getCity() + " " + FantasySchedule.games.get(gameIndex).getHomeTeam().getName() + " vs ");
//				System.out.print(FantasySchedule.games.get(gameIndex).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(gameIndex).getAwayTeam().getName());
//				System.out.println();
//			}
		
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

