import java.util.ArrayList;
import java.util.Scanner;
public class FantasySchedule
	{
		protected static ArrayList<Team> teams = new ArrayList<Team>();
		protected static ArrayList<Game> games = new ArrayList<Game>();
		public static void main(String[] args)
			{
				
				teams.add(new Team("Hotshots", "Arizona", "Western Conference", 1, 0, 0));
				teams.add(new Team("Stallions", "Salt Lake", "Western Conference", 0, 0, 1));
				teams.add(new Team("Commanders", "San Antonio", "Western Conference", 1, 0, 0));
				teams.add(new Team("Fleet", "San Diego", "Western Conference", 0, 0, 1));
				teams.add(new Team("Legends", "Atlanta", "Eastern Conference", 0, 0, 1));
				teams.add(new Team("Iron", "Birmingham", "Eastern Conference", 1, 0, 0));
				teams.add(new Team("Express", "Memphis", "Eastern Conference", 0, 0, 1));
				teams.add(new Team("Apollos", "Orlando", "Eastern Conference", 1, 0, 0));
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
				
				Game.addNewGame();
				Game.printGameSchedule();
			}
	}
