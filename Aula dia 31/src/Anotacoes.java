/*
 * Falou de 'final' que dizer que � uma variavel constante.Ex:public(com ou sem static) final String Diretorio = "c:/dev"
 * Boas praticas nas variaveis final:devem ser tudo maiusculo.Pode ser feita no metodo:
 * public final void String teste(){
 *	}->>>Nenhuma classe filha pode sobreescrever esse metodo pois � final.
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
 * 	public abstract void correr();------>>>>N pode ter codigo.Qualquer classe que estenda animal � obrigada a implementar esse metodo.
 * 
 * 
 * }--->>>Se remover o correr() n�o abstrato do Animal l� no main:
 * Animal x[] = new Animal[1000];-->>>>>>Isso pode pois cria um array em cada posi��o v�o ser animais mas n�o new Animal() ou seja ser� so os filhos.Cada posi��o � null.
 * for(){												
 * 	x[i].correr();->>>Erro de compila��o pois o correr n ta no animal.
 * }
 * 
 * Devido a isso � impossivel fazer : new Animal()--->Erro de compila��o devido ao abstract.
 * public class Leao extends Animal{
 * 		public void correr(){
 * 			SYSO("Pata para frente");
 * 			SYSO("Proxima pata");
 * 		}
 * 
 * }
 * 
 * public classe Elefante extends Animal{
 * 			public void correr(){		----> � obrigado a colocar pois � abstrato, sen�o � erro de compila��o.
 * 
 * 			}
 * 
 * 
 * Regras:
 * -Uma classe abstrata pode ter ou n�o metodos abstratos.Entretanto se a classe tiver um metodo abstrato tem que se tornar a classe como abstrata.
 * -A classe abstrata pode ter contrutor.
 * -Os metodos abstratas podem ter qualquer modificador.
 * --------------------------------------Desenho-----------------
 * 
 * 
 * Agora se tiver morcego ele n�o corre mas � um animal.Ent�o para resolver o problema � criar uma 'interface' .
 * Interface Corredor que tem o metodo correr.Ai bota o ganso,galinha,gato,c�o.
 * Pode ter uma interface Voador so para ganso,morcego.
 * 
 * Uma interface � uma classe asbtrata s� com metodos abstratos.Entretanto tem um custo tem que implementar os metodos. 
 * public class Ganso extends Animal implements Voador,Corredor{
 * 
 * }
 * Uma classe pode estender uma classe , ou/e ter muitas interfaces.
 * 
 *
 * Todas variaveis numa interface � public static final.
 * Agora na abstrata pode ter qualquer coisa.
 * 
 * public class Lista{
 *	public static final String x;--->Erro de compila��o pois n�o tem valor default.� necessario definir. 
 * 
 * }
 * 
 * 
 * 
 */




public class Anotacoes {

}
