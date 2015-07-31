package basics;

import java.util.ArrayList;
import java.util.List;


public class PingTai {
	
	public PingTai(){
		list=new ArrayList<WanJia>();
	}
	
	List<WanJia> list;
	
	int ZGIndex;
	PaiDui chupaidui;
	PaiDui qipaidui;
	public PingTai(int i){
		list=new ArrayList<WanJia>(i);	
		for(int j=0;j<i;++j){
			list.add(new WanJia(new WuJiang(), ShenFen.NJ, j+1, this));
		}
		init();
	}
	
	public void init(){

		
		//TODO init WanJia
		ZGIndex=0;
		
		//TODO init ShouPai, PaiDui
		chupaidui=new PaiDui();
		chupaidui.init();
		qipaidui=new PaiDui();
		for(WanJia wanjia:list){
			wanjia.shoupai.add(chupaidui.pop(4));
		}
	}
	
	public int start(){
		int i=0;
		while(true){
			WanJia wanjia=list.get(i);
			//TODO each WanJia wan
			
			//TODO HuiHeKaiShi
			wanjia.huiHeKaishi();
			//TODO PanDingKaiShi
			wanjia.panDingKaishi();
			//TODO PanDing
			wanjia.panDing();
			//TODO PanDingJieShu
			wanjia.panDingJieShu();
			//TODO MoPaiKaiShi
			wanjia.moPaiKaishi();
			//TODO MoPai
			wanjia.moPai();
			//TODO ChuPaiKaiShi
			wanjia.chuPaiKaishi();
			//TODO ChuPai
			wanjia.chuPai();
			//TODO ChuPaiJieShu
			wanjia.chuPaiJieShu();
			//TODO HuiHeJieShu
			wanjia.huiheJieShu();
			
			++i;
			i=i%list.size();
		}
	}
}
