package prog_principais;
import java.util.Scanner;
import materias_escolares.Mochila;

public class UsarMochila {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		Mochila M[] = new Mochila[4];
		int i;
		for(i=0;i<M.length;i++)
		{
			M[i] = new Mochila();
			System.out.println("Digite a cor");
			String s = in.next();
			M[i].setCor(s);
			System.out.println("Digite o ano de fabricação ");
			int n = in.nextInt();
			M[i].setAnoFab(n);
		}
		for(Mochila j:M){
			j.mostrarMochila();
		}
		in.close();
	}
}
