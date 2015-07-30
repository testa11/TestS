package basics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import pai.jiben.Sha;
import pai.jiben.Tao;

public class PaiDui {
	List<Pai> paidui;

	public PaiDui(List<Pai> paidui) {
		super();
		this.paidui = paidui;
	}
	
	public PaiDui(){
		this(new LinkedList<Pai>());
	}
	
	public PaiDui add(Pai pai){
		paidui.add(pai);
		return this;
	}
	
	public PaiDui add(List<Pai> pai){
		paidui.addAll(pai);
		return this;
	}
	
	public List<Pai> getAll(){
		return paidui;
	}
	
	public PaiDui remove(Pai pai){
		paidui.remove(pai);
		return this;
	}
	
	public PaiDui remove(int i){
		paidui.remove(i);
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
	
	public PaiDui init(){
		for(int i=0;i<100;++i){
			paidui.add(new Sha());
		}
		for(int i=0;i<10;++i){
			paidui.add(new Tao());
		}
		xipai();
		return this;
	}
	
	public Pai pop(){
		Pai pai=paidui.get(0);
		remove(0);
		return pai;
	}
	
	public List<Pai> pop(int num){
		List<Pai> popList=paidui.subList(0, num);
		paidui.removeAll(popList);
		return popList;
	}
	
	public PaiDui addToBottom(Pai pai){
		return add(pai);
	}
	
	public void clear(){
		paidui.clear();
	}
	
	public PaiDui addToBottom(List<Pai> pai){
		paidui.addAll(pai);
		return this;
	}
	
	public PaiDui addToTop(List<Pai> pai){
		paidui.addAll(0, pai);
		return this;
	}
	
	public PaiDui addToTop(Pai pai){
		paidui.add(0, pai);
		return this;
	}
	
	public PaiDui xipai(){
		Collections.shuffle(paidui);
		return this;
	}
}
