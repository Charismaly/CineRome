package com.demos.cine.model;

public class Prix {
	
	private double valeur;
	
	public Prix(double p) throws Exception{
		setPrix(p);
	}
	
	public double getPrix(){
		return valeur;
	}
	
	public void setPrix(double p) throws Exception{
		if (p<0){
			 throw new Exception("Prix n�gatif");
		 }
		 valeur=p;
	}

}
