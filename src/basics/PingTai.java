package basics;

import java.util.ArrayList;
import java.util.List;


public class PingTai {
	
	public PingTai(){
		list=new ArrayList<WanJia>();
	}
	
	List<WanJia> list;
	
	int ZGIndex;
	static PaiDui chupaidui;
	static PaiDui qipaidui;
	public PingTai(int i){
		list=new ArrayList<WanJia>(i);		
	}
	
	public void init(){
		//TODO init ShouPai, PaiDui
		
		//TODO init WanJia
		ZGIndex=0;
	}
	
	public int start(){
		int i=0;
		chupaidui=new PaiDui();
		chupaidui.init();
		qipaidui=new PaiDui();
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
