import java.sql.*;

public class ProdutoDAO{
	String driver = "";
	String url = "";
	Connection con;
	PreparedStatement ps;
	String sql;
	
	public void adicionar() {
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url,"","");
			System.out.println("Conexão com o banco de dados realizada!");
			Produto prod = new Produto();
			
			sql = "insert into Produto values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1,prod.getCodigo());
			ps.setString(2,prod.getNome());
			ps.setString(3,prod.getMarca());
			ps.setString(4,prod.getDescricao());
			ps.setDouble(5,prod.getPreco());
			ps.setString(6,prod.getQuant());
			
			ResultSet rs = ps.executeQuery();
		}catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado!");
			
		}catch(SQLException e) {
			System.out.println("Não foi posssível acessar o banco de dados!");
		}
	}

	public void remover() {
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url,"","");
			System.out.println("Conexão com o banco de dados realizada!");
			Produto prod = new Produto();
		
	}
}
