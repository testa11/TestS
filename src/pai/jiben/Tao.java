package pai.jiben;

import pai.JiBenPai;
import basics.Pai;
import basics.WanJia;

public class Tao extends JiBenPai {

	@Override
	public Pai requires(){
		return null;
	}
	@Override
	public void xiaoguo(WanJia wanjia){
		++wanjia.dangqianxueliang;
	}
}
