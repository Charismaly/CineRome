package com.demos.cine.model;

public class PP {

	public static void main(String[] args) {
		
		Panier p = new Panier();
		 
		try {
			Article livre = new Article("ref1", "Martine à la plage", new Prix(5.5), 25);
			p.ajouter(livre, 3);
		} catch (Exception e) {
			System.out.println("Article non crée car prix incorrect");
		}
		
		try {
			Article dvd = new Article("ref2", "Les aventures de Oui Oui",new Prix(15), 50);
			p.ajouter(dvd, 2);
		} catch (Exception e) {
			System.out.println("Article non crée car prix incorrect");
		}
		
		System.out.println(p.toString());
		System.out.println(p.getNbElements());
		System.out.println(p.getPrixTotalHT()+"€");

	}

}
