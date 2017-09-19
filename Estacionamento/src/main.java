


import java.text.SimpleDateFormat;

import javax.swing.JFrame;

import model.Estacionamento;
import model.Veiculo;
import view.tela_Login;

public class main {

	public static void main(String[] args) {
		Estacionamento Estacionamento = new Estacionamento();	

		Veiculo a = new Veiculo();
		
	//	Estacionamento.adiciona_Veiculo(a);
		
		tela_Login login = new tela_Login();
		
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setSize(530, 260);
		login.setVisible(true);
		
	}
	

}
