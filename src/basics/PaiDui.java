package basics;

import java.util.ArrayList;
import java.util.List;

public class PaiDui {
	List<Pai> paidui;

	public PaiDui(List<Pai> paidui) {
		super();
		this.paidui = paidui;
	}
	
	public PaiDui(int num){
		this(new ArrayList<Pai>(num));
	}
	
	public PaiDui(){
		this(new ArrayList<Pai>());
	}
	
	public PaiDui add(Pai pai){
		paidui.add(pai);
		return this;
	}
	
	public PaiDui remove(Pai pai){
		paidui.remove(pai);
		return this;
	}
	
	public Pai get(int i){
		return paidui.get(i);
	}
	
	public int getIndex(Pai pai){
		return paidui.indexOf(pai);
	}
	
	public int getSize(){
		return paidui.size();
	}
	
}
