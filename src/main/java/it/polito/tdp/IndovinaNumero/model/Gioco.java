package it.polito.tdp.IndovinaNumero.model;

public class Gioco {
	
	private int TMax = 8;
	private int NMax = 100;
	private int NTentativiFatti;
	private int numeroSegreto;
	
	public int getTMax() {
		return TMax;
	}
	public int getNMax() {
		return NMax;
	}
	public int getNTentativiFatti() {
		return NTentativiFatti;
	}
	public int getNumeroSegreto() {
		return numeroSegreto;
	}
	
	public void IniziaGioco() {
		this.NTentativiFatti = 0;
    	this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
    	
    	/*try {
    		this.TMax = Integer.parseInt(this.txtTMax.getText());
    	}catch(NumberFormatException e) {
    		this.txtCom.setText("TMax deve eseere un numero!");
    	}
    	
    	try {
    		this.NMax = Integer.parseInt(this.txtNMax.getText());
    	}catch(NumberFormatException e) {
    		this.txtCom.setText("NMax deve eseere un numero!");
    	}*/
	}
		
	/**
	 * funzione che esegue un tentativo del gioco
	 * @return restituisce 0 se vinto, 1 se perso, 2 numero troppo alto, 3 numero è troppo basso
	 */
	
	public int faiTentativo(int tentativo) {
		
		this.NTentativiFatti++;
		
		//giocare
    	if (tentativo == this.numeroSegreto) {
    		return 0;
    	}
    	
    	if (this.NTentativiFatti == this.TMax) {
    		return 1;
    	}
    	
    	if(tentativo>this.numeroSegreto) {
    		return 2;
    	}else  {
    		return 3;
    	}
	}
}
