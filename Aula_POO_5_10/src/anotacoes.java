/*
 * ArrayList x =new ArrayList()
 * x.add(Object);
 * x.add(15);-->Primitivo(n é objeto) mas funciona pois isso vira automaticamente um objeto chamado Integer.
 * Interger y = new Interger(15);-->Objeto que represente um inteiro---->Circulo(Interger) com um quadrado dentro(int 15)
 * Syso(y.intValue())-->retorna primitivo
 * 
 * 
 * Antigamente(versão 1.4) era obrigatorio usar x.add(Integer(15))
 * e depois int i = ((Integer)x.get(0)).intValue();
 * 
 * Agora é automatico(versão 1.5).Transforma primitivo em classe.Isso se chama auto-boxing.
 * x.add(10);
 * int k = (Integer)x.get(0);-->Transforma de Integer para int.Unboxing.Usa o casting pq o get retorna object.
 * Ele n cobra isso.Mas existe uma tabela.Double -- double , Float - float , Byte - byte , Short-short, Character--char
 * Essa tabela são as Rapper classes.--->>>Pergunta da prova.Como é a tabela?!!!!!!!!¨%¨%$¨%$%(0.5)
 * 
 * -------------------------------------------------------------------------------------------
 * 
 * "O meu site é http://www.oi.com" --> quero excluir o 'http' do ArrayList.Primeiro passo usar split.
 * Usa o split vai ter um array de strings.--->S[]
 * for(){
 * 	if(S[i].startsWith("http")){--->retorna um boolean se começa com palavra.Tem tb o endsWith-->Se a string termina com a palavra escolhida.
 * 		syso("Removendo");
 * 	}
 * }
 * Questão de PROVA:
 * MetodoX(String A,String b){---->Compara qtd characteres da string A existe na b na mesma posição.Ex:a=Casa e b= Caxa
 * 
 * }-->retorna 3
 * ----------------------------------------
 * 
 * String str = "a casa é bonita.A casa caiu";
 * str.ReplaceAll("casa","mesa");--->"A mesa é bonita.A mesa caiu"-->N muda a string antiga.Ela retorna a string com essa mudança.
 * 
 * str = str.ReplaceAll("casa","mesa");-->Isso muda o str.
 * 
 *Funciona:str.ReplaceAll("casa","mesa").ReplaceAll("casa","mesa").ReplaceAll("casa","mesa")....;
 * str.ReplaceAll()---->Percorrer um laço de um mapa com tabela de vc - voce , tb - tambem....
 * 
 * 
 * 
 * -------------------------------------------------
 * Pegar um pedaço da String.
 * String str = "A casa amarela";--->Quer pegar o "ca".
 *String k= Str.substring(2,4)--->Caracteres da posição 2 ate a 4.Exclusivo a 4.Ou seja o char 2 e 3.
 * k="ca";
 * 
 * Agora "A casa pox é assim" -->Quer saber se tem palavrão(pox)
 * int i=str.indexOf("Pox");--->retorna a posição 8
 * if(i>-1){
 * String j=str.substring(0,i);
 * j--->"A casa ";
 * 
 * j+="xxx";
 * String k = str.substring(i+3,str.lenght()).-->" é assim"
 * 
 * j+=k;
 * j--->"A casa xxx é assim"
 *
 *}
 *
 *PROVA:PODE PEDIR O REPLACEALL OU O SUBSTRING para tirar uma frase proibida de 10000 strings.Ou uma string gigantesca.
 *O REPLACEALL é mais demorado que a Substring.
 *x="Frase gigante"
 *int num =x.indeof("palavra que deseja")
 *String v = str.substring(num,x.lenght)  
 *int espaco = v.indexof(" "); 
 *
 *String link = v.substring(num,espaco);
 * 
 *
 *x.replaceall(link,"");
 *
 *
 */
public class anotacoes {
	public static void main(String args[]){
		String s = "o meu site é http:sdfsdfsdf";
		String str[] = s.split(" ");
		System.out.println(str[2]);
		
		
		
		
		
		
		
		
		
		System.out.println(metodoX("Pbsa","Cbsa"));
	}
	public static int metodoX(String a,String b){
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		int cont=0;
		for(int i=0;i<a.length();i++){
			if(c1[i]==c2[i]){
				cont++;
			}
		}
		return cont;
	}
	public static void Mudar(String A){
		String str[] =A.split(" ");
		for(int i=0;i<str.length;i++){
			
			if(str[i].length() > 2){
				char c[] = str[i].toCharArray();
			}
		}
	}
}

