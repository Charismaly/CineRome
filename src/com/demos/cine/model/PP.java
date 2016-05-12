package com.demos.cine.model;

public class PP {

	public static void main(String[] args) {
		
		Article livre = new Article("ref1", "Martine à la plage",5.5, 25);
		Article dvd = new Article("ref2", "Les aventures de Oui Oui", 15, 50);
		
		Panier p = new Panier();
		p.ajouter(livre, 3);
		p.ajouter(dvd, 2);
		
		System.out.println(p.toString());
		System.out.println(p.getNbElements());
		System.out.println(p.getPrixTotalHT()+"€");

	}

}
