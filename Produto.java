public class Produto{
	private String codigo;
	private String nome;
	private String marca;
	private String descricao;
	private double preco;
	private String quant;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getQuant() {
		return quant;
	}
	public void setQuant(String quant) {
		this.quant = quant;
	}
}