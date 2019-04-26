import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * PROVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 * 
 * 
 * 
 * So vai cair ate esses metodos.N todos dos slides
 * 
 * 
 * 
 * 
 */
public class NovoTest {

	public static void main(String[] args) {
		List x = new ArrayList();
		x.add(new Leao("SIMBA"));
		x.add(new Ganso("bidu"));
		x.add(new Leao("Mufasa"));
		Scanner in = new Scanner(System.in);
		String str =in.nextLine();
		Animal A =new Animal(str);
		if(x.contains(new Animal(str))){//---->Faz um laço(PROVA) e Usa implicitamente o equals
			System.out.println("Encontrei");
		}
		System.out.println(x.indexOf(A));//----->Usa implicitamente o equals
		x.remove(A);//----->Usa implicitamente o equals
		x.remove(0);//----->Usa implicitamente o equals e remove a posição
		System.out.println(x);
		
		
	}

}
