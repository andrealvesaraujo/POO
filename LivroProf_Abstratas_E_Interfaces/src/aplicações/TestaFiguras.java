package aplicações;

import figuras.*;
public class TestaFiguras {
	public static void main(String args[]){
		AreaCalculavel A1=new Quadrado(30.5);
		AreaCalculavel A2 = new Retangulo(10, 10);
		
		System.out.println(A1.calculaArea());
		System.out.println(A2.calculaArea());
	}
}
