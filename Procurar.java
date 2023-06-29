import javax.swing.*;

public class Procurar extends JFrame{
	private JLabel texto1;
	private JTextField pesquisa;
	private JButton procura;

	public Procurar() {
		exibir();
		executar();
	}

	private void exibir() {
		setTitle("Procurar Produtos");
		setBounds(30,30,600,200);
		setLayout(null);
		texto1 = new JLabel("Digite o comando para procura: ");
		pesquisa = new JTextField(10);
		procura = new JButton("Ok");

		texto1.setBounds(30,10,200,20);
		pesquisa.setBounds(210,10,200,20);
		procura.setBounds(420,10,80,20);

		add(texto1);
		add(pesquisa);
		add(procura);
	}

	private void executar() {

	}

	public static void main(String[] args) {
		Procurar tela = new Procurar();

		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}