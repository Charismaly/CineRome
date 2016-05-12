package com.demos.cine.model;

public class LignePanier {
	
	private Article a;
	private int qteCommandee;
	
	public LignePanier(Article a, int qteCommandee) {
		this.a = a;
		this.qteCommandee = qteCommandee;
	}

	public Article getA() {
		return a;
	}

	public int getQteCommandee() {
		return qteCommandee;
	}

}
