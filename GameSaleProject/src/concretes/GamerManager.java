package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import adapters.EDevletServiceAdapter;
import entitity.Gamer;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(EDevletServiceAdapter eDevletServiceAdapter) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamer.getFirstName()=="Umut" && gamer.getLastName()=="Teker" && gamer.getDateOfBirth().getYear()== 2000 && gamer.getNationalityId()== "68547523891" ) {
			
			System.out.println("E-devlet tarafından onaylandı! " + gamer.getFirstName() + " " + gamer.getLastName() + " " + " isimli kullanıcı eklendi!");
		}else
		{
			System.out.println("Onaylanmadı!");
		}
		
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " " + gamer.getLastName() + " isimli kullanıcı güncellendi!");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " " + gamer.getLastName() + "isimli kullanıcı silindi!");
	}

}
