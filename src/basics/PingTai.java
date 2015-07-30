package basics;

import java.util.ArrayList;
import java.util.List;

public class PingTai {
	
	public PingTai(){
		list=new ArrayList<WanJia>();
	}
	
	List<WanJia> list;
	
	int ZGIndex;
	
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
		while(true){
			//TODO each WanJia wan
		}
	}
}
