package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tela_Login extends JFrame {

	public tela_Login() {
		super("Estacionamento v1.0");
		Menu();
		cadastrar_Clientes();
	}
		
	private void Menu() {
		JMenu Vagas = new JMenu("Vagas");
		JMenuItem item_Novo = new JMenuItem("Reservar");
		Vagas.add(item_Novo);
		
		JMenuItem salvar = new JMenuItem("Salvar");
		
		Vagas.add(salvar);
		
		JMenuItem fechar = new JMenuItem("Fechar");
		Vagas.add(fechar);
		
		JMenu reservas  = new JMenu("Reservas");
		
		JMenu help  = new JMenu("Help");
		
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		
		barra.add(Vagas);
		barra.add(reservas);
		barra.add(help);
	}
	
	private void cadastrar_Clientes() {
		setLayout(new BorderLayout());
	
		JPanel painel_Titulo = new JPanel();
		painel_Titulo.setLayout(new FlowLayout());
			
		JLabel titulo = new  JLabel("Cadastro de clientes");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));	
	
		painel_Titulo.add(titulo);
		
		JPanel painel_Cadastro = new JPanel();
		painel_Cadastro.setLayout(new FlowLayout());
		JLabel nome_Cliente = new JLabel("Nome");
		JTextField nome_Field = new JTextField(40);
		
		JLabel telefone_Cliente = new JLabel("Telefone");
		JTextField telefone_Field = new JTextField(40);
		
		painel_Cadastro.add(nome_Cliente);
		painel_Cadastro.add(nome_Field);
		painel_Cadastro.add(telefone_Cliente);
		painel_Cadastro.add(telefone_Field);
	
		JPanel painel_Botoes = new JPanel();
		painel_Botoes.setLayout(new FlowLayout());
		
		JButton botao_Salvar = new JButton("Salvar");
		JButton botao_Fechar = new JButton("Fechar");
		
		painel_Botoes.add(botao_Salvar);
		painel_Botoes.add(botao_Fechar);
		
		//add(painel_Titulo, BorderLayout.NORTH);
		add(painel_Titulo, BorderLayout.CENTER);
		//add(painel_Titulo, BorderLayout.SOUTH);
		//add(painel_Titulo, BorderLayout.WEST);
	}

	
}
