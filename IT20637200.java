

// C.M.K.P.Yasantha
// IT20637200
// 4.2



public class Board   //Class Board
{

	
	
	private int superdot;
	private int dot;
	private int hunterdot;
	private String DotType;
	private Soldier[] threeSoldier;
	Hunter myhunter;

	

	
	public Board() {};
	
	public Board(String DotType, Hunter myhunter, Soldier[] threeSoldier) 
	{ 
		
		
		this.DotType = DotType;
		this.myhunter = myhunter;
		this.threeSoldier = threeSoldier;
		this.init();
	}
	
	public void SetDotType(String DotType) 
	{ 
		
		this.DotType = DotType;
	}
	
	public String GetDotType() 
	{ 
		
		return DotType;
	}
	
	public void SetDot(int dot) 
	{ 

		this.dot = dot; 
	}

	public int GetDot()
	{ 

		return dot;
	}

	public void SetSuperDot(int superdot) 
	{

		this.superdot = superdot;
	}

	public int GetSuperDot()
	{ 

		return 3; 
	}

	public void SetHunterDot(int hunterdot)
	{ 

		this.hunterdot = hunterdot;
	}
	
	public int getHunterDot()
	{ 

		return 97; 
	}

	public void init() 
	{ 

		for(int Counter = 0; Counter<3; Counter++)
		{
			threeSoldier[Counter].SetyPos((int)Math.random()* 360);
			threeSoldier[Counter].SetxPos((int)Math.random()* 250); 
			
		}
		
		System.out.println("Board is Ready and there soldiers and the hunter is positioned in the board"); //OutPut

	}
	
}




public class Hunter   // Class Hunter
{

	private String name;
	private String color;
	private int xPos;
	private int yPos;
	

public Hunter(String Hname, String Hcolor)
{
	
	this.name = Hname;
	this.color = Hcolor;

}

public void SetxPos(int x)
{
	
	this.xPos = x;
}

public void SetyPos(int y)
{
	
	this.yPos = y;
}

public int GetxPos()
{
	
	return xPos;
}

public int GetyPos()
{
	
	return yPos;
}

	public void move(Hunter myhunter)throws SoundException
	{
		
		if(myhunter.xPos<1 || myhunter.xPos >= 250 || myhunter.yPos < 1 || myhunter.yPos >=360) 
		{ 
		    System.out.println("Hunter is moving, " + "x :" +myhunter.xPos+ " Y :" +myhunter.yPos); //OutPut
				throw new SoundException("Oh oo!");	 
		}
		else 
		{
			System.out.println("Hunter is moving, X: " +myhunter.xPos + " Y :" +myhunter.yPos); //OutPut
		} 
	}
	
	public void hunt(Board myboard, String dotType ) 
	{ 
		if(dotType == "superDot") 
		{ 
			System.out.println("Hunting super dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0){
				
			}
		}

		else if(dotType == "hunterdot") 
		{ 
			System.out.println("Hunting hunter dots");
			myboard.SetDot(myboard.GetDot() -1);
			if(myboard.GetSuperDot() == 0 && myboard.GetDot() == 0) {
			System.out.println("Game Over, You Win"); //OutPut
		}

	   }
		
	}


}



import java.util.Scanner;

public class MainApp //Main Class 
{

	public static void main(String[] args) 
	{

		
		Scanner sc = new Scanner(System.in);
		Hunter myhunter = new Hunter("Maha Deva", "Brown");
		Soldier threeSoldier[] = {new RedSoldier(), new RedSoldier(), new GreenSoldier};
		Board myboard = new Board("superDot", myhunter, threeSoldiers);
		
		System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");
		myhunter.setxPos(sc.nextInt());
		myhunter.setyPos(sc.nextInt());
		myhunter.move(myhunter);
		threeSoldier[2].hunt();
		
		

	}

}




public class Soldier  // Class Soldier
    {

	private int xPos;
	private int yPos;
	
	public Soldier(int x, int y) 
	{
		
		this.xPos = x;
		this.yPos = y;
		
	}
	
	public void SetxPos(int x) 
	{
		this.xPos = x;
		
	}
	
	public void SetyPos(int y)
	{
		this.yPos =y;
	}
	
	public int GetxPos()
	{
		return xPos;
		
	}
	
	public int GetyPos()
	{
		return yPos;
	}
	
	public void hunt() {
		
		
	}
	
	class RedSoldier extends Soldier //Class RedSoldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by hand"); //OutPut
			System.out.println("Game over"); //OutPut
			
		}
	}
	
	class BlueSoldier extends Soldier //Class BlueSoldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by gun"); //OutPut
			System.out.println("Game over"); //OutPut
			
		}
	}
	
	class GreenSoldier extends Soldier //Class GreenSoldier
	{
		
		public void hunt() 
		{
			System.out.println("Killed using by knife"); //OutPut
			System.out.println("Game over"); //OutPut
			 
		}
	}
	
		
}





public class SoundException extends Exception  //Class SoundException 
{

	public SoundException(String msg)
	{
	super(msg);
	}
	
}




