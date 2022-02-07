import java.*;
import java.util.*;

class Auction
{

	String PlayerName = " ", PlayerCountry = " ", PlayerRole = " ";
	int PlayerAge, PlayerBasePrice;
	Scanner sc = new Scanner(System.in);


	String static_playerName[] = { "Virat Kohli", "Ms Dhoni","Rohit Sharma","Chris Gayle","Ab Devillers","Hardik Pandya","KL Rahul","Jasprit Bumrah","M Shami","B kumar"};
	String dynamic_playerName[] = new String[10] ;
	String final_playerName[] = new String[20] ;

	String static_playerCountry[] = { "India", "India","India","WestIndies","SouthAfrica","India","India","India","India","India"};
	String dynamic_playerCountry[] = new String[10] ;
	String final_playerCountry[] = new String[20] ;

	int static_playerBasePrice[] = { 20000000, 20000000,20000000,10000000,15000000,7000000,10000000,15000000,10000000,9000000};
	int dynamic_playerBasePrice[] = new int[10] ;
	int final_playerBasePrice[] = new int[20] ;

	String static_playerRole[] = { "Batsman", "Wk Batsman","Batsman","Batsman","Batsman","All Rounder","Wk Batsman","Bowler","Bowler","Bowler"};
	String dynamic_playerRole[] = new String[10] ;
	String final_playerRole[] = new String[20] ;

	int static_playerAge[] = {32, 40,33,41,37,25,27,31,33,32};
	int dynamic_playerAge[] = new int[10] ;
	int final_playerAge[] = new int[20] ;

	int player_length=0;


	void staticPlayer()
	{
		System.arraycopy(static_playerName, 0, final_playerName, 0, 10);  
		System.arraycopy(dynamic_playerName, 0, final_playerName, 10, 10);

		System.arraycopy(static_playerCountry, 0, final_playerCountry, 0, 10);  
		System.arraycopy(dynamic_playerCountry, 0, final_playerCountry, 10, 10);

		System.arraycopy(static_playerBasePrice, 0, final_playerBasePrice, 0, 10);  
		System.arraycopy(dynamic_playerBasePrice, 0, final_playerBasePrice, 10, 10);

		System.arraycopy(static_playerRole, 0, final_playerRole, 0, 10);  
		System.arraycopy(dynamic_playerRole, 0, final_playerRole, 10, 10);

		System.arraycopy(static_playerAge, 0, final_playerAge, 0, 10);  
		System.arraycopy(dynamic_playerAge, 0, final_playerAge, 10, 10);
	}
	void dynamicPlayerDetail() 
	{

		String name, country, role;
		int age, basePrice;

		System.out.println("\nEnter Player's Name ");
		name = sc.nextLine();
		dynamic_playerName[player_length] = name;


		System.out.println("Enter Player's Age ");
		age = sc.nextInt();
		dynamic_playerAge[player_length] = age;

		sc.nextLine();
		System.out.println("Enter Player's Role ");
		role = sc.nextLine();
		dynamic_playerRole[player_length] = role;

		System.out.println("Enter Player's Country ");
		country = sc.nextLine();
		dynamic_playerCountry[player_length] = country;


		System.out.println("Enter Player's Base Price ");
		basePrice = sc.nextInt();
		dynamic_playerBasePrice[player_length] = basePrice;


		System.arraycopy(static_playerName, 0, final_playerName, 0, 10);  
		System.arraycopy(dynamic_playerName, 0, final_playerName, 10, 10);

		System.arraycopy(static_playerCountry, 0, final_playerCountry, 0, 10);  
		System.arraycopy(dynamic_playerCountry, 0, final_playerCountry, 10, 10);

		System.arraycopy(static_playerBasePrice, 0, final_playerBasePrice, 0, 10);  
		System.arraycopy(dynamic_playerBasePrice, 0, final_playerBasePrice, 10, 10);

		System.arraycopy(static_playerRole, 0, final_playerRole, 0, 10);  
		System.arraycopy(dynamic_playerRole, 0, final_playerRole, 10, 10);

		System.arraycopy(static_playerAge, 0, final_playerAge, 0, 10);  
		System.arraycopy(dynamic_playerAge, 0, final_playerAge, 10, 10);  

		System.out.println("\n"+name + " is Registered for Auction");
		player_length++;
		sc.nextLine();
	}

	void displayPlayers(int i) {

		System.out.println("\n===================================\n\t PLAYER DETAILS\n===================================");
		System.out.println("\t"+ final_playerName[i]);
		System.out.println("\tAge : " + final_playerAge[i]);
		System.out.println("\tRole : " + final_playerRole[i]);
		System.out.println("\tCountry : " + final_playerCountry[i]);
		System.out.println("\tBase Price : " + final_playerBasePrice[i]);

	}

	String static_team[] = { "RCB", "CSK", "MI", "DC", "KXIP" };
	String dynamic_team[] = new String[5] ;
	String final_team[] = new String[10] ;

	int static_funds[] = { 500000000, 450000000, 420000000, 480000000, 460000000 };
	int dynamic_funds[] = new int[5] ;
	int final_funds[] =  new int[10] ;

	int team_length=0;

	void staticTeam()
	{
		System.arraycopy(static_team, 0, final_team, 0, 5);  
		System.arraycopy(dynamic_team, 0, final_team, 5, 5);

		System.arraycopy(static_funds, 0, final_funds, 0, 5);
		System.arraycopy(dynamic_funds, 0, final_funds, 5, 5); 
	}
	void addTeam()
	{

		String teamName;
		int teamBudget;


		System.out.println("\nEnter Team Name :");

		teamName = sc.nextLine();
		dynamic_team[team_length] = teamName;


		System.out.println("Enter Team Budget :");
		teamBudget = sc.nextInt(); 
		dynamic_funds[team_length] = teamBudget;

		System.arraycopy(static_team, 0, final_team, 0, 5); 
		System.arraycopy(dynamic_team, 0, final_team, 5, 5); 

		System.arraycopy(static_funds, 0, final_funds, 0, 5); 
		System.arraycopy(dynamic_funds, 0, final_funds, 5, 5); 

		System.out.println("\n"+teamName + " is Registered with "+ teamBudget +" for Auction");
		sc.nextLine();
		team_length++;
	}

	void auctionProcess()
	{
		System.out.println("\n*****************************************************	*\n\t\t AUCTION BEGINS\n******************************************************");
		char ch;
		String playerSoldTeam="";
		int bid=0, basePrice=0,i,j,counter=0,counterNo=0,counterYes=0,final_team_length=0,final_player_length=0;

		final_team_length=5 + team_length;
		final_player_length=10 + player_length;

		staticTeam();
		staticPlayer();

		for(i =0;i<final_player_length;i++)
		{
			displayPlayers(i);
			basePrice=final_playerBasePrice[i];

			if (final_playerName[i]==null)
			{      
				break;
			}
			counter=0;
			while(counterNo!=final_team_length-1)
			{
				for (j = 0; j < final_team_length; j++) 
				{
					counter++;

					if(counter>final_team_length-1)
					{
						if(final_team[j]==final_team[0])
						{
							counterYes=1;
						}
					}

					if (final_team[j]==null)
					{
						break;
					}

					System.out.println("\n" + final_team[j] + "\nDo you want Bid for " + final_playerName[i] +" (y/n) : ");

					ch = sc.nextLine().charAt(0);

					if (ch == 'y' || ch == 'Y') 
					{
						counterYes++;
						do {
							System.out.println("Base Price  : " + basePrice);
							System.out.println("Place Bid :" );
							bid = sc.nextInt();
						} while (bid < basePrice);

						basePrice = bid;
						System.out.println(final_playerName[i]);
						System.out.println("New Price  : " + basePrice);
						playerSoldTeam = final_team[j] ;
						sc.nextLine();
						counterNo=0;

					}
					else if(ch == 'n' || ch == 'N')
					{
						counterNo++;
					}
					if(counterNo==final_team_length-1 && counterYes==1)
					{
						final_funds[j]=final_funds[j]-basePrice;
						System.out.println("Funds"+final_funds[j]);
						System.out.println("*********************************************************\n\t " + final_playerName[i] +" Sold to " + playerSoldTeam + " for "+ basePrice + "\n*********************************************************");
						break;
					}
					else if(counterNo==final_team_length)
					{
						System.out.println("**************************************\n\t"+final_playerName[i] +" Unsold \n**************************************" );
						break;
					}
				}
				if(counterNo==final_team_length)
				{
					break;
				}
			}
			counterNo=0;
			counterYes=0;
		}
	}
	void viewPlayers() 
	{
		staticPlayer();
		int length=10 + player_length;
		for(int i=0;i<length;i++)
		{
			System.out.println("\n===================================\n\t PLAYER DETAILS\n===================================");
			System.out.println( "\t"+ final_playerName[i]);
			System.out.println("\tAge : " + final_playerAge[i]);
			System.out.println("\tRole : " + final_playerRole[i]);
			System.out.println("\tCountry : " + final_playerCountry[i]);
			System.out.println("\tBase Price : " + final_playerBasePrice[i]);

		}
	}

	void displayTeam()
	{
		staticTeam();


		int length=5 + team_length;
		System.out.print("\n=========================================\n\tParticipated Teams\n=========================================\n");
		for(int i=0;i<length;i++)
		{
			System.out.println("\n\nTeam Name : " + final_team[i] + "\nAvailable Funds : "+ final_funds[i]);
		}
	}
}
class main
{
	public static void main(String[] args) {

		Auction aobj = new Auction();

		int choice;

		while(true)
		{
      //ASCII value from user
			System.out.println("\n*******************************************\n\t VIRTUAL AUCTION SYSTEM\n*******************************************");
			System.out.println("1. Register a Team \n2. Team Participated\n3. List of Player Partcipated\n4. Add Player in Participant List\n5. Start Auction\n6. Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch(choice)
			{
				case 1 :
				aobj.addTeam();
				break;
				case 2 :
				aobj.displayTeam();
				break;
				case 3 :
				aobj.viewPlayers();
				break;
				case 4 :
				aobj.dynamicPlayerDetail();
				break;
				case 5 :
				aobj.auctionProcess();
				break;
				case 6 :
				System.exit(0);
				break;
				default :
				System.out.println("Invalid Choice");
			}    
		}
	}
}