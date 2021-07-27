package concretes;

import abstracts.GamerCheckService;
import entitity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

}
