package atividades;

//import selvagens.Cachorro;
//import selvagens.Tartaruga;
import selvagens.Animal;
import selvagens.Gato;

public class Principal {
	public static void main(String args[])
	{
		//Gato x = new Gato();//Animal x = new Gato() o inverso( Gato x = new Animal()) est� errado
		
		
		Animal x = new Gato();
		
		/*Object x = new Gato() funciona mas n tem set nem get, isso
		muda a forma como olha para ele.Isso � Polimorfismo.Ainda � um gato mas esta referenciado/olhado como animal/object
		Quando � Object gera erro por causar de miar pois agora X � animal.*/
		
		//Gato y = x;Erro de compila��o.Pode ser resolvido com typecasting
		
		
		x.setNome("Felix");
		
		//System.out.println(x.getNome());
		//System.out.println(x.miar());//Erro de compila��o pois miar retorna void.Vai ter na prova
		//x.miar();//N pode ser x for animal
		
		/*Em caso do correr animal e correr gato.Se x for referenciado como animal,em tempo de execu��o chama o gato correndo.
		Ele olha o primeiro do filho para o pai(da subclasse para a superclasse*/
		
		x.correr();
		System.out.println(x.equals("Abc"));
		//System.out.println(x.getNome());//Quest�o de Prova:Compila se for x.nome?N�o
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
