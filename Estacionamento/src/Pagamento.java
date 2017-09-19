
public class Pagamento {
	private double valorCobrado;
	private boolean cartao;
	private double valorEntregue;

	
	public Pagamento(double cobrado, double entregue) {
		this.valorCobrado = cobrado;
		this.valorEntregue = entregue;
	}
	
	public String paga(boolean cartao, double valor) {
		if(cartao) {
			//conecta a operadora de cartao
			//chama metodo para cart�o
		}
		if((getValorCobrado()-getValorEntregue())==0) {
			return"ok";
		} else {
			return "Tentar Novamente";
			
		}
		
	}
	public boolean isCartao() {
		return cartao;
	}
	public void setCartao(boolean cart�o) {
		this.cartao = cart�o;
	}
	

	public double getValorCobrado() {
		return valorCobrado;
	}


	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}


	public double getValorEntregue() {
		return valorEntregue;
	}


	public void setValorEntregue(double valorEntregue) {
		this.valorEntregue = valorEntregue;
	}
	
	
	
}
