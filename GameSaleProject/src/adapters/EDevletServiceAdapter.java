package adapters;

import abstracts.GamerCheckService;
import entitity.Gamer;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("E-devlet sistemine giriş yapıldı!");
		return true;
	}

}
