
import java.time.LocalDate;


import adapters.EDevletServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import entitity.Campaign;
import entitity.Game;
import entitity.Gamer;

public class Main {

 
	    public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(1,"Umut","Teker",LocalDate.of(2000,01,01),"68547523891");
  
		Game game1=new Game(1,"WOW",20);
		
		Campaign campaign=new Campaign(1,"Yaz",10,LocalDate.of(2021,6,01),LocalDate.of(2021,8,31));
		
		
		GamerManager gamerManager = new GamerManager(new EDevletServiceAdapter());
		gamerManager.add(gamer1);
	
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);

		GameManager gameManager=new GameManager();
		gameManager.add(game1);
}
}