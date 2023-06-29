
import javax.swing.*;
import java.awt.event.*;

public class Inicio extends JFrame{
	private JButton adiciona;
	private JButton procura;
	private JButton atualiza;
	private JButton exclui;
	
	public void exibir() {
		setTitle("Cadastro de Produtos para Informática");
		setBounds(10,10,600,400);
		setLayout(null);
		adiciona = new JButton("Adicionar Produto");
		procura = new JButton("Procurar Produtos");
		atualiza = new JButton("Atualizar Produto");
		exclui = new JButton("Excluir Produto");
		
		adiciona.setBounds(100,100,200,30);
		procura.setBounds(310,100,200,30);
		atualiza.setBounds(100,140,200,30);
		exclui.setBounds()
		
		add(adiciona);
		add(procura);
	}
	public void executar() {
		adiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface i = new Interface();
				i.setVisible(true);
			}
		});

		procura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Procurar p = new Procurar();
				p.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		Inicio tela = new Inicio();
		
		tela.exibir();
		tela.executar();
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}