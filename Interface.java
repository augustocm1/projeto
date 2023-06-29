
import javax.swing.*;
import java.awt.event.*;

public class Interface extends JFrame{
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbMarca;
	private JLabel lbDesc;
	private JLabel lbPreco;
	private JLabel lbQuant;
	private JTextField cod;
	private JTextField nome;
	private JTextField marca;
	private JTextArea desc;
	private JTextField preco;
	private JTextField quant;
	private JButton btAdiciona;
	private JButton btCancela;

	public static boolean validaCodigo(String codigo){
		return codigo.matches("\\d{5}");
	}

	public Interface() {
		exibir();
		executar();
	}

	private void exibir() {
		setTitle("Cadastro de Produtos para Informática");
		setBounds(30,30,600,400);
		setLayout(null);
		lbCodigo = new JLabel("Código:");
		lbNome = new JLabel("Nome:");
		lbMarca = new JLabel("Marca:");
		lbDesc = new JLabel("Descrição: ");
		lbPreco = new JLabel("Preço Unitário:");
		lbQuant = new JLabel("Quant. em Estoque:");
		cod = new JTextField(5);
		nome = new JTextField(30);
		marca = new JTextField(30);
		desc = new JTextArea();
		preco = new JTextField(6);
		quant = new JTextField(4);
		btAdiciona = new JButton("Adicionar Produto");
		btCancela = new JButton("Cancelar Operação");


		lbCodigo.setBounds(10,30,100,20);
		lbNome.setBounds(10,60,100,20);
		lbMarca.setBounds(320,60,100,20);
		lbDesc.setBounds(10,90,100,20);
		lbPreco.setBounds(10,140,100,20);
		cod.setBounds(110,30,200,20);
		nome.setBounds(110,60,200,20);
		marca.setBounds(370,60,160,20);
		desc.setBounds(110,90,300,40);
		preco.setBounds(110,140,100,20);
		lbQuant.setBounds(220,140,150,20);
		quant.setBounds(340,140,100,20);
		btAdiciona.setBounds(20,220,150,20);
		btCancela.setBounds(180,220,150,20);

		add(cod);
		add(lbCodigo);
		add(nome);
		add(lbNome);
		add(marca);
		add(lbMarca);
		add(desc);
		add(lbDesc);
		add(preco);
		add(lbPreco);
		add(quant);
		add(lbQuant);
		add(btAdiciona);
		add(btCancela);
	}
	private void executar() {
        btAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String codStr = String.valueOf(cod.getText());
                String nomeStr = String.valueOf(nome.getText());
                String marcaStr = String.valueOf(marca.getText());
                String descStr = String.valueOf(desc.getText());
                double precoDb = Double.parseDouble(preco.getText());
                String quantStr = String.valueOf(quant.getText());

                if(!Interface.validaCodigo(codStr)) {
					/*System.out.println("O código precisa ter 5 caracteres!");*/
					JOptionPane.showMessageDialog(null,"O código precisa ter 5 caracteres!");
               	}else {
					if(nomeStr.length() < 5) {
                		JOptionPane.showMessageDialog(null,"O nome do produto precisa ter 5 ou mais caracteres!");
                 		/*System.out.println("O nome do produto precisa ter 5 ou mais caracteres!");*/
					}else{
                		if(marcaStr.length() < 2) {
							/*System.out.println("A marca precisa ter 2 ou mais caracteres!");*/
							JOptionPane.showMessageDialog(null,"A marca precisa ter 2 ou mais caracteres!!");
                		}else {
							/*System.out.println("Produto cadastrado com sucesso!!");*/
							JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!");
							Produto prod = new Produto();

							prod.setCodigo(codStr);
							prod.setNome(nomeStr);
							prod.setMarca(marcaStr);
							prod.setPreco(precoDb);
							prod.setQuant(quantStr);

							System.out.println("Código: " +prod.getCodigo());
							System.out.println("Nome: " +prod.getNome());
							System.out.println("Marca: " +prod.getMarca());
							System.out.println("Preço: R$ " +prod.getPreco());
							System.out.println("Quantidade em estoque: " +prod.getQuant());
								
							/*ProdutoDAO pd = new ProdutoDAO();
										
							pd.adicionar();

							System.exit(0);*/
                		}
					}
        		}
			}
        });
        btCancela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.exit(0);
			}
        });
	}

	public static void main(String[] args) {
		Interface frame = new Interface();

		/*frame.exibir();
		frame.executar();*/
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}