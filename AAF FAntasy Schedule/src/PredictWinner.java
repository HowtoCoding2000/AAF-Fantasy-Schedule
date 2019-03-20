import java.util.Scanner;
public class PredictWinner
	{
		public static void predictWinner()
			{
				Scanner userInput = new Scanner(System.in);
				int gamePlayedChoice = 0;
				int userWeekChoice = 0;
				int userGameChoice = 0;
				if(FantasySchedule.games.size() == 0)
					{
						System.out.println("There are currently " + FantasySchedule.games.size() + " games in the system.");
						System.out.println("You must have at least 1 game in the system in order to predict the winner.");
					}
				else
					{
						AddNewGame.printGameSchedule();
						do
							{
								System.out.println("Enter the number of the week you would like to predict a game winner for.");
								userWeekChoice = userInput.nextInt() - 1;
							}
						while (userWeekChoice < 1 && userWeekChoice > AddNewGame.week);
						do
							{
								int counter = 0;
								System.out.println("Enter the number of the game you would like to predict the winner for.");
								for(int i = 0; i < FantasySchedule.games.size(); i++)
									{
										if(FantasySchedule.games.get(i).getWeek() == userWeekChoice + 1)
											{
												System.out.print("(" + counter + ") ");
												AddNewGame.printGame(i);
												counter++;
											}
									}
								userGameChoice = userInput.nextInt() - 1;
							}
						while (userGameChoice < 1 && userGameChoice + (4 * userWeekChoice) > FantasySchedule.games.size());
						userGameChoice = userGameChoice + (4 * userWeekChoice);
						gamePlayedChoice = 0;
						do
							{
								System.out.println("Has this game been played?");
								System.out.println("(1) Yes");
								System.out.println("(2) No");
								gamePlayedChoice = userInput.nextInt();
							}
						while (gamePlayedChoice < 1 && gamePlayedChoice > 2);
						if(userWeekChoice == 1)
							{
								System.out.println("You cannot predict the winner of a game that has already been played.");
							}
						else
							{
//								System.out.print("Week " + FantasySchedule.games.get(userGameChoice).getWeek() + ": ");
//								System.out.print(FantasySchedule.games.get(userGameChoice).getHomeTeam().getCity() + " " + FantasySchedule.games.get(userWeekChoice).getHomeTeam().getName() + " vs ");
//								System.out.print(FantasySchedule.games.get(userGameChoice).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(userWeekChoice).getAwayTeam().getName());
//								System.out.println();
								AddNewGame.printGame(userGameChoice);
								System.out.println("Which team do you predict will win?");
								System.out.println("(1) " + FantasySchedule.games.get(userGameChoice).getHomeTeam().getCity() + " " + FantasySchedule.games.get(userWeekChoice).getHomeTeam().getName());
								System.out.println("(2) " + FantasySchedule.games.get(userGameChoice).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(userWeekChoice).getAwayTeam().getName());
								gamePlayedChoice = userInput.nextInt();
								System.out.println();
								if(gamePlayedChoice == 1)
									{
										FantasySchedule.games.get(userGameChoice).setWinnerPredicted(true);
										FantasySchedule.games.get(userGameChoice).setHomeTeamPredicted(true);
									}
								else
									{
										FantasySchedule.games.get(userGameChoice).setWinnerPredicted(true);
										FantasySchedule.games.get(userGameChoice).setHomeTeamPredicted(false);
									}
							}
					}	
			}
	}
