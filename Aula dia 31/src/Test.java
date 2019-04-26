import java.util.Scanner;



/*
 * Outra materia da prova:
 * toda vez que comparar se objetos são iguais utiliza: equals que é da classe Object
 * A String subescreve equals.
 * Enquanto as outras classe usa o equals do Object que equivale ao um if(==)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Test {
	public static void main(String args[]){
		String A="abc";
		Scanner x =new Scanner(System.in);
		
		String str = x.nextLine();
		
		System.out.println(A==str);//ISso sairia false
		
		String b="abc";
		System.out.println(A==b);//Não aponta para dois objetos.Pool de Strings.Isso acontece com String para otimizar.
		System.out.println(str.equals("A"));//Compara se as letra são iguais, compara posição por posição.
		
		
			
			Leao x1 =new Leao();
			x1.setNome("Simba");
			Leao x2 =new Leao();
			x2.setNome("Simba");
			System.out.println(x1.equals(x2));//----->São diferentes pois em Object é equivalente ao 'x==x1"
		  // Para mudar isso deve sobrescrever
 
		 
		
		
		
		
	}
}
