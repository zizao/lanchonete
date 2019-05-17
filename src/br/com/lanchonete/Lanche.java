package br.com.lanchonete;

public class Lanche {
	private int id;
	private int alface;
	private int bacon;
	private int carne;
	private int ovo;
	private int queijo;
	private double valor;
	private String nome;
	
	public Lanche(String nome, int alface, int bacon, int carne, int ovo, int queijo) {
		this.nome = nome;
		this.alface = alface;
		this.bacon  = bacon;
		this.carne  = carne;
		this.ovo    = ovo;
		this.queijo = queijo;
	}
	
	public double calculaValor() {
		double valor = 0;
		
		valor = (this.alface * 0.4) + (this.bacon * 2) + (this.carne * 3) + 
				(this.ovo * 0.8) + (this.queijo * 1.5);
		
		if(this.alface > 0 && this.bacon == 0) {
			valor = valor * 0.9;
		}
		
		return valor;
	}
	
	public double getValor() {
		this.valor = calculaValor();
		return this.valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
