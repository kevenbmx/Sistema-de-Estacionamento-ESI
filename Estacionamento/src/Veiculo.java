

public class Veiculo {
	
	private boolean moto; // 0 ou 1 (se for moto)
	private String placa;
	private String modelo;
	private String marca;
	private String hora_Entrada;
	private String hora_Saida;
	
	public Veiculo(String placa, String modelo,String marca, String hora_Entrada) {
		this.placa = placa;
		this.modelo = modelo;
		this.hora_Entrada = hora_Entrada;
		this.marca = marca;
	}
	
	public void setMoto (boolean x) {
		this.moto = x;
	}
	
	public String getPlaca () {
		return placa;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	public String getMarca () {
		return marca;
	}
	
	public String getHora_Entrada () {
		return hora_Entrada;
	}
	
	public String getHora_Saida () {
		return hora_Saida;
	}
	
}
