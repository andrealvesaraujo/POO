import java.util.Scanner;
public class Anotações {
	public static void main(String[] args){
		FormasG total[];
		String entrada;
		System.out.println("Digite quantas formas geometricas vc deseja");
		Scanner in = new Scanner(System.in);
		
		total = new FormasG[in.nextInt()];
		
		for(int i=0;i<total.length;i++){
			System.out.println("Digite o nome da forma");
			entrada=in.next();
			if(entrada.equals("Quadrado")){
				System.out.println("Digite o lado");
				total[i]=new Quadrado(in.nextDouble());
			}
			if(entrada.equals("Circulo")){
				System.out.println("Digite o raio");
				total[i]=new Circulo(in.nextDouble());
			}
		}
		for(int i=0;i<total.length;i++){
			System.out.println(total[i].perimetro());
			System.out.println(total[i].area());
		}
		
		
	}
}

/*
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
 * 
 * 
 * 
 * 
 * 
 * 
 */
