package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pai.jiben.Tao;
import paidui.PanDing;

public class WanJia {

	WuJiang wujiang;
	ShenFen shenfen;
	int zuowei;
	static PingTai pingtai;
	
	PaiDui shoupai;
	PaiDui zhuangbei;
	PaiDui panding;
	
	public int dangqianxueliang;
	
	
	public WanJia(WuJiang wujiang, ShenFen shenfen, int zuowei, final PingTai pingtai) {
		super();
		this.wujiang = wujiang;
		this.shenfen = shenfen;
		this.zuowei = zuowei;
		this.pingtai = pingtai;
		shoupai=new PaiDui();
		zhuangbei=new PaiDui();
		panding=new PaiDui();
		dangqianxueliang=getShenFenJiaX()+wujiang.xueliang;
	}
	
	public int getShouPaiShangXian(){
		return dangqianxueliang;
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
	
	public void xiangyingChuPai(Pai pai, WanJia wanjia) throws IOException{
		Pai requirePai=pai.requires();
		if(requirePai==null){
			pai.xiaoguo(wanjia);
			return;
		}
		if(shoupai.paidui.contains(requirePai)){
			System.out.println("Print Yes to chupai, else to diaoxue");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line=br.readLine();
			if(line.trim().equalsIgnoreCase("yes")){
				shoupai.remove(requirePai);
				return;
			}			
		}
		diaoxue(1);
	}
	
	public void diaoxue(int num) throws IOException{
		dangqianxueliang-=num;
		if(dangqianxueliang<=0){
			qiutao(dangqianxueliang);
		}
		if(dangqianxueliang<=0){
			System.exit(zuowei);
		}
	}
	
	public void qiutao(int num) throws IOException{
		int i=0;
		while((i<pingtai.list.size())&&(dangqianxueliang<=0)){
			int j=(zuowei+i++)%pingtai.list.size();
			WanJia wanjia=pingtai.list.get(j);
			if(wanjia.shoupai.paidui.contains(new Tao())){
				System.out.println("Chu tao?");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				if("yes".trim().equalsIgnoreCase(br.readLine())){
					++dangqianxueliang;
				}
			}
		}
	}
	
	public void chuPai(){
		try {
			String line="START";
			while(!line.equals("QUIT")){
				printDangQianShouPai();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				line=br.readLine();
				int i=Integer.valueOf(line);
				Pai chupai=shoupai.get(i);
				shoupai.remove(i);
				printOtherWanJia();
				br=new BufferedReader(new InputStreamReader(System.in));
				WanJia wanjia=pingtai.list.get(Integer.valueOf(br.readLine()));
				wanjia.xiangyingChuPai(chupai,this);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void printOtherWanJia(){
		String output="";
		for(int i=0;i<pingtai.list.size();++i){
			if(i!=zuowei){
				output+=i+". "+pingtai.list.get(i).getName()+" ; ";
			}
		}
		System.out.println(output);
	}
	
	public String getName() {
		return wujiang.getName();
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
		return dangqianxueliang;
	}
	
	public int getZongXueLiang(){
		return getShenFenJiaX()+wujiang.xueliang;
	}
}
