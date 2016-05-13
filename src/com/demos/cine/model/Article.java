package com.demos.cine.model;

public class Article {
	
	private String reference;
	private String designation;
	private double prixHT;
	private int qteStock;
	private boolean dematerialise;
	
	public Article(String reference, String designation, double prixHT, int qteStock) {
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
		this.dematerialise=false;
	}
	
	//objets dématérialisés
	public Article(String reference, String designation, double prixHT) {
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = 0;
		this.dematerialise=true;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public String getReference() {
		return reference;
	}

	public String getDesignation() {
		return designation;
	}

	public int getQteStock() {
		return qteStock;
	}
	
	public boolean isDematerialise() {
		return dematerialise;
	}

	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}

	public void incrementeStock (int qteLivree){
		qteStock += qteLivree;
	}
	
	public void decrementeStock (int qteCommandee){
		qteStock -= qteCommandee;
	}

	@Override
	public String toString() {
		String description="";
		if(!isDematerialise()){
		description= "reference="+reference+", designation="+designation+", prixHT="+prixHT+", qteStock="
				+ qteStock;
		}
		else{
			description= "reference="+reference+", designation="+designation+", prixHT="+prixHT+", objet dématérialisé";
		}
		return description;
	}
	
	

}
