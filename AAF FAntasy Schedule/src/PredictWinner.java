import java.util.Scanner;
public class PredictWinner
	{
		public static void predictWinner()
			{
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
								System.out.println("Enter the number of the week you would like to peredict the winner for.");
								System.out.println("Has this game been played?");
							}
						predictingWinner = false;
					}
				while(predictingWinner == true);
			}
	}
