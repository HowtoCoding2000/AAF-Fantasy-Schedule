import java.util.ArrayList;
import java.util.Scanner;
public class FantasySchedule
	{
		static ArrayList<Team> teams;
		static ArrayList<Game> games;
		static int userMenuChoice = 0;
		static boolean stillRunning = true;
		public static void main(String[] args)
			{
				Scanner userMenuInput = new Scanner(System.in);
				teams = new ArrayList<Team>();
				games = new ArrayList<Game>();
				//0
				teams.add(new Team("Hotshots", "Arizona", "Western Conference", 1, 0, 0));
				//1
				teams.add(new Team("Stallions", "Salt Lake", "Western Conference", 0, 0, 1));
				//2
				teams.add(new Team("Commanders", "San Antonio", "Western Conference", 1, 0, 0));
				//3
				teams.add(new Team("Fleet", "San Diego", "Western Conference", 0, 0, 1));
				//4
				teams.add(new Team("Legends", "Atlanta", "Eastern Conference", 0, 0, 1));
				//5
				teams.add(new Team("Iron", "Birmingham", "Eastern Conference", 1, 0, 0));
				//6
				teams.add(new Team("Express", "Memphis", "Eastern Conference", 0, 0, 1));
				//7
				teams.add(new Team("Apollos", "Orlando", "Eastern Conference", 1, 0, 0));
				games.add(new Game(1, teams.get(3), teams.get(2), false, false));
				games.add(new Game(1, teams.get(4), teams.get(7), false, false));
				games.add(new Game(1, teams.get(6), teams.get(5), false, false));
				games.add(new Game(1, teams.get(1), teams.get(0), false, false));
				printTeams();
				do
					{
						do
							{
								System.out.println("What would you like to do?");
								System.out.println("(1) Add a new game");
								System.out.println("(2) Print the game schedule");
								System.out.println("(3) Predict the winner of a game");
								userMenuChoice = userMenuInput.nextInt();
								if(userMenuChoice == 1)
									{
										System.out.println();
										AddNewGame.addNewGame();
									}
								else if(userMenuChoice == 2)
									{
										System.out.println();
										AddNewGame.printGameSchedule();
										System.out.println();
									}
								else if(userMenuChoice == 3)
									{
										System.out.println();
										PredictWinner.predictWinner();
									}
							}
						while(userMenuChoice < 1 && userMenuChoice > 3);
					}
					while(stillRunning);
			}
		public static void printTeams()
			{
				int i = 0;
				boolean conference2Used = false;
				for (Team t : teams)
					{
						if (i == 0)
							{
								System.out.println(teams.get(i).getConference() + ":");
							}
						else if (teams.get(i).getConference() != teams.get(0).getConference())
							{
								if (conference2Used == false)
									{
										System.out.println();
										System.out.println(teams.get(i).getConference() + ":");
										conference2Used = true;
									}
							}
						System.out.print(teams.get(i).getCity() + " " + teams.get(i).getName() + "  " + teams.get(i).getWins() + "-");
						if (teams.get(i).getTies() > 0)
							{
								System.out.print(teams.get(i).getTies() + "-");
							}
						System.out.print(teams.get(i).getLosses());
						System.out.println();
						i++;
					}
				System.out.println();
			}
	}
