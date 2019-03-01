
public class Team
	{
		public String name;
		public String city;
		public String conference;
		public int wins;
		public int ties;
		public int losses;
		public Team(String n, String c, String co, int w, int t, int l)
			{
				name = n;
				city = c;
				conference = co;
				wins = w;
				ties = t;
				losses = l;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getCity()
			{
				return city;
			}
		public void setCity(String city)
			{
				this.city = city;
			}
		public String getConference()
			{
				return conference;
			}
		public void setConference(String conference)
			{
				this.conference = conference;
			}
		public int getWins()
			{
				return wins;
			}
		public void setWins(int wins)
			{
				this.wins = wins;
			}
		public int getTies()
			{
				return ties;
			}
		public void setTies(int ties)
			{
				this.ties = ties;
			}
		public int getLosses()
			{
				return losses;
			}
		public void setLosses(int losses)
			{
				this.losses = losses;
			}
		
	}
