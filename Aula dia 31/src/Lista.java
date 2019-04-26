import java.util.ArrayList;

/*Tudo em java que for uma lista(encadeada,baseada em array) implementa a interface List
 * ArrayList � uma classe que implementa List.Isso � melhor que um array pois um array x n�o pode ser aumentado e � dificil saber se tem uma string especificia ou se est� cheia
 * Usando ArrayList n�o precisa incomodar perguntar se tem espa�o livre ou n�o.Ele vai adicionar ate quando tu quiser.
 * ArrayList x = new ArrayList();
 * x.add("A");
 * x.add("B");
 * x.get(0)--->retorna object-->>>Usa typecasting para conseguir a referencia que deseja
 * SYSO(x.size)--->Mostra o tamanho ate agora.
 * x.contain("bola")---->retorna verdadeiro ou falso se elemento esta no arraylist.
 * � muito melhor que array.Mas vai cair os dois na prova.
 * 
 * List x =new ArrayList ->>>>Tb funciona e � preferivel
 * 
 * CAI NA PROVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 * 
 * 
 * 
 */
public class Lista{
	public static void main(String args[]){ 
		ArrayList x = new ArrayList();
		x.add("A");
		x.add("B");
		x.add("bola");
		x.add("casa");
		x.add(new Gato());
		System.out.println(x.size());
		x.remove("bola");
		System.out.println(x.size());
		System.out.println(x.get(1));
		System.out.println(x); //---->Imprime vetor
		
		
		
	}
	
}
