package oopsdemo3;
class Game{
	public void play(){
		System.out.println("Game is being played");
		}
		 
		public void noOfPlayers(){
		System.out.println("No of players depend upon the game");
		}
		 
		public void winner(String name){
		System.out.println("Winner is : " + name);
		}
	
}
class Cricket extends Game{
	public void noOfPlayers(){
		System.out.println("22");
		}
		 
		public void teams(){
		System.out.println("2");
		}
}
class Chess extends Game{
	 
	public void noOfPlayers(){
	System.out.println("2");
	}
	}

//Upcasting is used when you want to generalise a function or
//property so that it can be used by any of it�s subtype.


public class UpcastingDemo {
public static void main(String[] args) {

Game g=new Cricket(); //upcasting --call to overriden and base class mtd
Game g1=new Chess();

g.play();
g.noOfPlayers();//dynamic binding
g.winner("A");
//g.teams() compiler error
Cricket c=new Cricket();//static binding
c.teams();

g1.play();
g1.noOfPlayers();
g1.winner("savi");


}

}
