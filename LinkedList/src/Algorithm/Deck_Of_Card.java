package Algorithm;

public class Deck_Of_Card 
{
	public static void shuffle(String[][] cat,int sl,int rl) 
	{
		String[][] temp = new String[sl][rl];
		double slr1;
		for(int i=0; i<sl; i++)
			for(int j=0; j<rl; j++) 
			{
				slr1=Math.random();
				temp[i][j]=cat[(int) (slr1*sl)][(int) (slr1*rl)];
				cat[(int) (slr1*sl)][(int) (slr1*rl)]=cat[i][j];
				cat[i][j]=temp[i][j];
			}
		System.out.println("***********************************************");
		for(int i=0; i<sl; i++)
			for(int j=0; j<rl; j++)
				System.out.println(cat[i][j]);
	}
	
	// main class
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
		String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int sl = suit.length;
		int rl = rank.length;
		String[][] cat = new String[sl][rl];
		for(int i=0; i<sl; i++)
			for(int j=0; j<rl; j++)
				cat[i][j] = suit[i] + " " + rank[j];
		for(int i=0; i<sl; i++)
			for(int j=0; j<rl; j++)
				System.out.println(cat[i][j]);
			
		shuffle(cat,sl,rl);
	}
}
