import org.apache.commons.math3.util.MathArrays;

/*
 * Continuando Utils:Depois vai para properties-->Java Build Path-->Libraries-->Add External JAR *
 *
 *Segunda maneira:Pega o .jar e bota dentro do projeto e em seguida utiliza o Add JAR
 *Best - Practises: Criar pasta para guardar os JAR internos.Aqui guardei o commons-math
 *
 *N cai na prova
 */

public class ContinuarUtils {
	public static void main(String args[]){
		System.out.println(Funcoes.media(3,2));
		int x[] = new int[10];
		for(int i=0;i<x.length;i++){
			x[i]=i;
		}
		for(int i=0;i<x.length;i++){
			System.out.printf("%d - ",x[i]);
		}
		System.out.println();
		MathArrays.shuffle(x);
		for(int i=0;i<x.length;i++){
			System.out.printf("%d - ",x[i]);
		}
		System.out.println();
	}
	
}
