/*
 * Falou de 'final' que dizer que é uma variavel constante.Ex:public(com ou sem static) final String Diretorio = "c:/dev"
 * Boas praticas nas variaveis final:devem ser tudo maiusculo.Pode ser feita no metodo:
 * public final void String teste(){
 *	}->>>Nenhuma classe filha pode sobreescrever esse metodo pois é final.
 * 
 * Pode ser botada na classe: public final class Animal-->>>Ninguem pode extender essa classe.Ex:String."A prova n cobra final."
 * 
 * 
 * -----------------------------------Classe Abstratas:--------------------------
 * public abstract class Animal{
 * 	public void correr(){ --->>>>>Ajuda o polimorfismo
 * 		SYSO("Animal correndo")
 * 	}
 * 
 * 	public abstract void correr();------>>>>N pode ter codigo.Qualquer classe que estenda animal é obrigada a implementar esse metodo.
 * 
 * 
 * }--->>>Se remover o correr() não abstrato do Animal lá no main:
 * Animal x[] = new Animal[1000];-->>>>>>Isso pode pois cria um array em cada posição vão ser animais mas não new Animal() ou seja será so os filhos.Cada posição é null.
 * for(){												
 * 	x[i].correr();->>>Erro de compilação pois o correr n ta no animal.
 * }
 * 
 * Devido a isso é impossivel fazer : new Animal()--->Erro de compilação devido ao abstract.
 * public class Leao extends Animal{
 * 		public void correr(){
 * 			SYSO("Pata para frente");
 * 			SYSO("Proxima pata");
 * 		}
 * 
 * }
 * 
 * public classe Elefante extends Animal{
 * 			public void correr(){		----> É obrigado a colocar pois é abstrato, senão é erro de compilação.
 * 
 * 			}
 * 
 * 
 * Regras:
 * -Uma classe abstrata pode ter ou não metodos abstratos.Entretanto se a classe tiver um metodo abstrato tem que se tornar a classe como abstrata.
 * -A classe abstrata pode ter contrutor.
 * -Os metodos abstratas podem ter qualquer modificador.
 * --------------------------------------Desenho-----------------
 * 
 * 
 * Agora se tiver morcego ele não corre mas é um animal.Então para resolver o problema é criar uma 'interface' .
 * Interface Corredor que tem o metodo correr.Ai bota o ganso,galinha,gato,cão.
 * Pode ter uma interface Voador so para ganso,morcego.
 * 
 * Uma interface é uma classe asbtrata só com metodos abstratos.Entretanto tem um custo tem que implementar os metodos. 
 * public class Ganso extends Animal implements Voador,Corredor{
 * 
 * }
 * Uma classe pode estender uma classe , ou/e ter muitas interfaces.
 * 
 *
 * Todas variaveis numa interface é public static final.
 * Agora na abstrata pode ter qualquer coisa.
 * 
 * public class Lista{
 *	public static final String x;--->Erro de compilação pois não tem valor default.É necessario definir. 
 * 
 * }
 * 
 * 
 * 
 */




public class Anotacoes {

}
