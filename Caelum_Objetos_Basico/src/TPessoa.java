
public class TPessoa {
	public static void main(String[] args)
	{
		Pessoa p = new Pessoa();
		p.idade=15;
		p.nome="Igor";
		System.out.println(p.nome +" "+ p.idade);
		p.aniversario();
		p.aniversario();
		
		System.out.println(p.nome +" "+ p.idade);
		
	}
}
