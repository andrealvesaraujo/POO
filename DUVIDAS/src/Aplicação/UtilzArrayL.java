package Aplicação;
import prodPlan.Motor;
import prodPlan.Parafuso;
import prodPlan.Parte;

import java.util.List;
import java.util.ArrayList;

public class UtilzArrayL {
	public static void main(String args[]){
		Parte p1 = new Motor(10f,10f,100);
		Parte p2 = new Parafuso(30f,200f);
		Parte p3 = new Parafuso(50f,300f);
		
		List a = new ArrayList();
		a.add(p1);
		
		//a.add(p2);
		//a.add(p3);
		
		a.add(p1);
		a.add(p1);
		((Motor)a.get(0)).setRpm(50);
		//a.contains(new Motor(10f,10f,100));
		
		/*for(int i=0;i<a.size();i++){
			if(a.get(i) instanceof Parafuso){
				Parafuso par = ((Parafuso)a.get(i));
				
				//System.out.println(par);//-->Devolte o toString
				a.add(par.getComprimento());
				
			}
			if(a.get(i) instanceof Motor){
				Motor m = (Motor)a.get(i);
				
				//System.out.println(m);
				a.add(m.getRpm());
				
			}
			
		}*/
		/*int num = a.indexOf(new Parafuso(30f,200f));
		System.out.println(num);
		for(int i=0 ; i<3;i++){
			a.remove(0);
		}
		num = a.indexOf(50f);
		System.out.println(num);
		System.out.println("Total " + a.size());
		*/
			
		System.out.println(a);
	}
}
