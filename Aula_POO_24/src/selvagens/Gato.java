package selvagens;

/* Anota��es:
 * 
 * 	Ele falou sobre o 'this'.Criamos 3 classes de animais(n pediu pacote) com getters e setters.
 *  Cada classe tem 66 linhas.Tem que economizar linha.Foto.Come�a falando do extends e tem a classica gravura de UML de heran�a.
 *  Criou a main.E tem dois gatos(x e y) e funciona seus get e set mesmo o codigo estando no Animal.
 * 	Falou de 3 perguntas da prova.Criou o miar.Criou o correr.
 * Comentou sobre Polimorfismo.Comentou sobre "Object" e sua heran�a direta ou indiretamente.
 * Criou 3 main's.Mostrou os problemas e as pegadinhas.Cuidado com array de classes.
 * Vai ter quest�o disso
 * Falou de sobescrever.
 * Terminou Heran�a.
 * 
 * 
 * Nova materia.Gato, construtor , super() ->>>>>>public animal() se for super("nome") ->>>public animal(String n)
 * Na prova n precisa se preocupar com package nem import
 * 
 * 
 * 
 */

public class Gato extends Animal{
	
	
	public void miar(){
		System.out.println("Gato " + getNome() + " miando");
	}
	public void correr()
	{
		System.out.println("Gato " + getNome() + " correndo");
	}
	public String toString()
	{
		return getNome();
	}
	public Gato()
	{
		super();
	}
	public Gato(String nome){
		super();
		this.setNome(nome);
	}
	public Gato(String nome,int idade){
		this.setNome(nome);
		this.setIdade(idade);
	}
}
