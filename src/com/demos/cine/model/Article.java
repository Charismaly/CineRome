package com.demos.cine.model;

public class Article {
	//article
	private String reference;
	private double prixHT;
	private String designation;
	private int qteStock;
	
	public Article(String reference, double prixHT, String designation, int qteStock) {
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
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
	
	public void incrementeStock (int qteLivree){
		qteStock += qteLivree;
	}
	
	public void decrementeStock (int qteCommandee){
		qteStock -= qteCommandee;
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", prixHT=" + prixHT + ", designation=" + designation + ", qteStock="
				+ qteStock + "]";
	}
	
	

}
