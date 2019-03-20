import java.util.Scanner;
import java.util.ArrayList;
public class AddNewGame
	{
		public static int userChoice = 0;
		public static int gameIndex = 0;
		public static int week = 1;
		public static void addNewGame()
			{
				boolean addingNewGame = true;
				do
					{
						Game g = new Game(0, null, null, false, false);
						Scanner userInput = new Scanner(System.in);
						boolean correctGameInfo = false;
						do
							{
								int userHomeChoice = 0;
								if(FantasySchedule.games.size() % 4 == 0)
									{
										week++;
									}
								g.setWeek(week);
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
								g.setHomeTeam(FantasySchedule.teams.get(userHomeChoice));
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
								g.setAwayTeam(FantasySchedule.teams.get(userAwayChoice));
								System.out.println();
								System.out.print("Week " + g.getWeek() + ": ");
								System.out.print(g.getHomeTeam().getCity() + " " + g.getHomeTeam().getName() + " vs ");
								System.out.print(g.getAwayTeam().getCity() + " " + g.getAwayTeam().getName());
								System.out.println();
								int counter = 0;
								userChoice = 0;
								do
									{
										System.out.println("Is this information correct?");
										System.out.println("(1) Yes");
										System.out.println("(2) No");
										userChoice = userInput.nextInt();
										if (userChoice == 1)
											{
												FantasySchedule.games.add(g);
												correctGameInfo = true;
												System.out.println();
//												printGameSchedule();
											}
//										else if (userChoice == 2)
//											{
//												FantasySchedule.games.remove(FantasySchedule.games.get(FantasySchedule.games.size() - 1));
//											}
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
								System.out.println();
							}
						while (userChoice != 1 && userChoice != 2);
					}
				while (addingNewGame);
			}
			
		public static void printGameSchedule()
			{
				if(FantasySchedule.games.size() > 0)
					{
						for (int i = 0; i < FantasySchedule.games.size(); i++)
							{
//								System.out.print("Week " + FantasySchedule.games.get(i).getWeek() + ": ");
//								System.out.print(FantasySchedule.games.get(i).getHomeTeam().getCity() + " " + FantasySchedule.games.get(i).getHomeTeam().getName());
//								if(FantasySchedule.games.get(i).isWinnerPredicted())
//									{
//											if(FantasySchedule.games.get(i).isHomeTeamPredicted())
//											{
//												System.out.print( " (Predicted Winner)");
//											}
//									}
//								System.out.print(" vs ");
//								System.out.print(FantasySchedule.games.get(i).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(i).getAwayTeam().getName());
//								if(FantasySchedule.games.get(i).isWinnerPredicted())
//									{
//										if(!FantasySchedule.games.get(i).isHomeTeamPredicted())
//											{
//												System.out.print( " (Predicted Winner)");
//											}
//									}
//								System.out.println();
								printGame(i);
							}
						System.out.println("*These are the games that are currently in the system.");
					}
				else
					{
						System.out.println("There are currently " + FantasySchedule.games.size() + " games in the system.");
					}
			}
		public static void printGame(int gameIndex)
			{
				System.out.print("Week " + FantasySchedule.games.get(gameIndex).getWeek() + ": ");
				System.out.print(FantasySchedule.games.get(gameIndex).getHomeTeam().getCity() + " " + FantasySchedule.games.get(gameIndex).getHomeTeam().getName());
				if(FantasySchedule.games.get(gameIndex).isWinnerPredicted())
					{
							if(FantasySchedule.games.get(gameIndex).isHomeTeamPredicted())
							{
								System.out.print( " (Predicted Winner)");
							}
					}
				System.out.print(" vs ");
				System.out.print(FantasySchedule.games.get(gameIndex).getAwayTeam().getCity() + " " +  FantasySchedule.games.get(gameIndex).getAwayTeam().getName());
				if(FantasySchedule.games.get(gameIndex).isWinnerPredicted())
					{
						if(!FantasySchedule.games.get(gameIndex).isHomeTeamPredicted())
							{
								System.out.print( " (Predicted Winner)");
							}
					}
				System.out.println();
			}
	}
