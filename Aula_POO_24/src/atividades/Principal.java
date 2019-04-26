package atividades;

//import selvagens.Cachorro;
//import selvagens.Tartaruga;
import selvagens.Animal;
import selvagens.Gato;

public class Principal {
	public static void main(String args[])
	{
		//Gato x = new Gato();//Animal x = new Gato() o inverso( Gato x = new Animal()) está errado
		
		
		Animal x = new Gato();
		
		/*Object x = new Gato() funciona mas n tem set nem get, isso
		muda a forma como olha para ele.Isso é Polimorfismo.Ainda é um gato mas esta referenciado/olhado como animal/object
		Quando é Object gera erro por causar de miar pois agora X é animal.*/
		
		//Gato y = x;Erro de compilação.Pode ser resolvido com typecasting
		
		
		x.setNome("Felix");
		
		//System.out.println(x.getNome());
		//System.out.println(x.miar());//Erro de compilação pois miar retorna void.Vai ter na prova
		//x.miar();//N pode ser x for animal
		
		/*Em caso do correr animal e correr gato.Se x for referenciado como animal,em tempo de execução chama o gato correndo.
		Ele olha o primeiro do filho para o pai(da subclasse para a superclasse*/
		
		x.correr();
		System.out.println(x.equals("Abc"));
		//System.out.println(x.getNome());//Questão de Prova:Compila se for x.nome?Não
		/*x.setNome("Felix");
		x.setIdade(15);
		x.setPeso(17.3);
		
		Cachorro y = new Cachorro();
		y.setIdade(20);
		y.setNome("Jorge");
		y.setPeso(55.5);
		
		System.out.println(x.getIdade()+" "+x.getPeso()+" "+ y.getPeso() + " " + y.getNome());*/
	}
}
