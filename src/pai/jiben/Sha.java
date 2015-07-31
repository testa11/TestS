package pai.jiben;

import basics.Pai;
import pai.JiBenPai;

public class Sha extends JiBenPai {
	@Override
	public Pai requires(){
		return new Shan();
	}

}
