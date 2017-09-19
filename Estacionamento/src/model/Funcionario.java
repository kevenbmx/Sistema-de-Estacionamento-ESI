package model;

public class Funcionario extends Pessoa{
	public Funcionario(String nome, int num_registro){
		super(nome, num_registro);
	}
	//public double salario;
	//public String função;
	
	public String getNome(){
		return nome;
	}
}

