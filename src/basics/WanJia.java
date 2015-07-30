package basics;

public class WanJia {

	WuJiang wujiang;
	ShenFen shenfen;
	int zuowei;
	PingTai pingtai;
	
	int dangxianxueliang;
	
	
	public WanJia(WuJiang wujiang, ShenFen shenfen, int zuowei, PingTai pingtai) {
		super();
		this.wujiang = wujiang;
		this.shenfen = shenfen;
		this.zuowei = zuowei;
		this.pingtai = pingtai;
		dangxianxueliang=getShenFenJiaX()+wujiang.xueliang;
	}

	public int getShenFenJiaX(){
		if(ShenFen.ZG.equals(shenfen)){
			return 1;
		}
		return 0;
	}
	
	public int getDangQianXueLiang(){
		return dangxianxueliang;
	}
	
	public int getZongXueLiang(){
		return getShenFenJiaX()+wujiang.xueliang;
	}
}
