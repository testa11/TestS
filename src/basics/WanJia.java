package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import paidui.PanDing;

public class WanJia {

	WuJiang wujiang;
	ShenFen shenfen;
	int zuowei;
	static PingTai pingtai;
	
	PaiDui shoupai;
	PaiDui zhuangbei;
	PanDing panding;
	
	int dangxianxueliang;
	
	
	public WanJia(WuJiang wujiang, ShenFen shenfen, int zuowei, final PingTai pingtai) {
		super();
		this.wujiang = wujiang;
		this.shenfen = shenfen;
		this.zuowei = zuowei;
		this.pingtai = pingtai;
		dangxianxueliang=getShenFenJiaX()+wujiang.xueliang;
	}
	
	public int getShouPaiShangXian(){
		return dangxianxueliang;
	}
	
	public void huiHeKaishi(){
		
	}
	
	public void panDingKaishi(){
		
	}
	
	public void panDing(){
		
	}
	
	public void panDingJieShu(){
		
	}
	
	public void moPaiKaishi(){
		
	}

	public void moPai(){
		
		if(pingtai.chupaidui.getSize()>=2){
			shoupai.add(pingtai.chupaidui.pop(2));
		}else{
			int i=pingtai.chupaidui.getSize();
			shoupai.add(pingtai.chupaidui.getAll());
			pingtai.chupaidui=pingtai.qipaidui.xipai();
			shoupai.add(pingtai.chupaidui.pop(2-i));
			pingtai.qipaidui=new PaiDui();
		}
	}
	
	public void chuPaiKaishi(){
		
	}
	
	public void chuPai(){
		printDangQianShouPai();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String line=br.readLine();
			while(!line.equals("QUIT")){
				int i=Integer.valueOf(line);
				Pai chupai=shoupai.get(i);
				shoupai.remove(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void printDangQianShouPai(){
		String output="";
		int i=0;
		for(Pai pai:shoupai.paidui){
			output+=i+++". "+pai.getName()+" ; ";
		}
		System.out.println(output);
	}
	
	public void chuPaiJieShu(){
		
	}
	
	public void qiPaiKaishi(){
		
	}
	
	public void qiPai(){
		
	}
	
	public void qiPaiJieShu(){
		
	}
	
	public void huiheJieShu(){
		
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
