package Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Banco_De_Dados {
	public static void main(String args[]) throws Exception{
		Connection c = getConnection();
		Scanner in = new Scanner(System.in);
		
		String sql="Create TABLE tb_aluno (nome VARCHAR(256), idade INTEGER)";
		String sl2="INSERT INTO tb_aluno (nome ,idade) VALUES ('Joao',25)";
		//update(c,sql);
		//update(c,sl2);
		imprime(c,"select * from tb_aluno");
		finalizar(c);
		
	}
	public static Connection getConnection() throws Exception{
		Class.forName("org.hsqldb.jdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:dbAluno2","sa","");
		System.out.println("Conectado");
		return conn;
	}
	public static void update(Connection c, String expression) throws SQLException{
		Statement st =null;
		st = c.createStatement();
		int i= st.executeUpdate(expression);
		if(i==-1){
			System.out.println("db error :" + expression);
		}
	}
	public static void imprime(Connection c, String sql) throws SQLException{
		Statement st=null;
		ResultSet rs =null;
		st= c.createStatement();
		rs=st.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getString("nome") + " "+rs.getString("idade"));
		}
	}
	
	public static void finalizar(Connection c) throws Exception{
		Statement st = c.createStatement();
		st.executeQuery("SHUTDOWN");
		c.close();
	}
}
