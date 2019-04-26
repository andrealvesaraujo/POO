
public class GatoTeste {
	public static void main(String[] args){
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato();
		g1.vivo=true;g1.cor="preto";g1.idade=3;g1.nome="Kat";
		g2.vivo=false;g2.cor="branco";g2.idade=2;g2.nome="Fofo";
		g3.vivo=true;g3.cor="cinza";g3.idade=5;g3.nome="naruto";
		System.out.println("Gato g1: "+ g1.nome + " " + g1.idade + " " + g1.vivo +" " + g1.cor);
		System.out.println("Gato g2: "+ g2.nome + " " + g2.idade + " " + g2.vivo +" " + g2.cor);
		System.out.println("Gato g1: "+ g3.nome + " " + g3.idade + " " + g3.vivo +" " + g3.cor);
		
	}
}
