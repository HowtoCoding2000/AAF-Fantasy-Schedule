import java.util.Scanner;
public class PredictWinner
	{
		public static void predictWinner()
			{
				Scanner userInput = new Scanner(System.in);
				int userChoice = 0;
				int userWeekChoice = 0;
				boolean predictingWinner = true;
				do
					{
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
										System.out.println("Enter the number of the week you would like to peredict the winner for.");
										userWeekChoice = userInput.nextInt() - 1;
									}
								while (userWeekChoice < 1 && userWeekChoice > FantasySchedule.games.size());
								do
									{
										System.out.println("Has this game been played?");
										System.out.println("(1) Yes");
										System.out.println("(2) No");
										userChoice = userInput.nextInt();
									}
								while (userChoice < 1 && userChoice > 2);
								userChoice = 0;
								if(userWeekChoice == 1)
									{
										System.out.println("You cannot predict the winner of a game that has already been played.");
									}
								else
									{
										System.out.print("Week " + FantasySchedule.games.get(userWeekChoice).getWeek() + ": ");
										System.out.print(FantasySchedule.games.get(userWeekChoice).getHomeTeam().getCity() + " " + FantasySchedule.games.get(userWeekChoice).getHomeTeam().getName() + " vs ");
										System.out.print(FantasySchedule.games.get(userWeekChoice).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(userWeekChoice).getAwayTeam().getName());
										System.out.println();
										System.out.println("Which team do you predict will win?");
										System.out.println("(1) " + FantasySchedule.games.get(userWeekChoice).getHomeTeam().getCity() + " " + FantasySchedule.games.get(userWeekChoice).getHomeTeam().getName());
										System.out.println("(2) " + FantasySchedule.games.get(userWeekChoice).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(userWeekChoice).getAwayTeam().getName());
										System.out.println();
										userChoice = userInput.nextInt();
										if(userChoice == 1)
											{
												FantasySchedule.games.get(userWeekChoice).setWinnerPredicted(true);
												FantasySchedule.games.get(userWeekChoice).setHomeTeamPredicted(true);
											}
										else
											{
												FantasySchedule.games.get(userWeekChoice).setWinnerPredicted(true);
												FantasySchedule.games.get(userWeekChoice).setHomeTeamPredicted(false);
											}
									}
							}
						predictingWinner = false;
					}
				while(predictingWinner == true);
			}
	}
