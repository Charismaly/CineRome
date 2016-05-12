package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	
	private ArrayList<LignePanier> contenu = new ArrayList<LignePanier>();
	private int nbElements=0;

	public Panier() {
		super();
	}
	
	public void ajouter(Article a, int qte){
		LignePanier e = new LignePanier(a,qte);
		contenu.add(e) ;
		nbElements+=qte;
	}
	
	public int getNbElements(){
		return nbElements;
	}

	public double getPrixTotalHT(){
		double prixtot=0;
		for (LignePanier l : contenu) {
			prixtot += l.getQteCommandee()*l.getA().getPrixHT();
		}
		return prixtot;
	}
	
	public String toString(){
		String description ="Contenu du panier : \n";
		for (LignePanier l : contenu) {
			description += l.getA().getReference()+" "+l.getA().getDesignation()+" "+l.getQteCommandee()+"\n" ;
		}
		return description;
	}

}
