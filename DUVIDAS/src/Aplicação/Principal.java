package Aplicação;

import prodPlan.Motor;
import prodPlan.Parafuso;
import prodPlan.Parte;


public class Principal {
	public static void main(String[] args){
		/*Motor a = new Motor(10f,20f,100);
		Motor b = new Motor(10f,10f,100);
		Parafuso p1 = new Parafuso(30f,200f);
		Parafuso p2 = new Parafuso(50f,300f);
		Parte f =a ;
		Parte x =p1;
		*/
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1==s3);//Quando da New as variaveis tem id's diferentes.E por causa disso é sempre false.
		
		System.out.println(s1==s2);//Mas se não de New estão no mesmo ID permitindo a comparação que nem o equals.
		
		
		
		
		//System.out.println(a.equals(new Parafuso(15f,100f)));
		//System.out.println(p2.equals(p2));
		//System.out.println(p2.equals(p2));
		//System.out.println(f.equals(a));
	}
}
