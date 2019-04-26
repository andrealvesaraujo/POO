import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.*;
/*
 * 
 * Mapa:(Não é uma coleção)
 * Tem uma chave(id) ligado a valor.
 * Ex:
 * "3298235"  -->>>"André"
 * "939349"->>>"Jose"
 * 
 */
public class MAPA {
	public static void main(String args[]){
		Carro c= new Carro("xxx");
		Map<String, Carro> x =new HashMap<String, Carro>();
		x.put(c.getPlaca(),c);
		x.put("yyy",new Carro("yyy"));
		Scanner in = new Scanner(System.in);
		String foto = in.nextLine();
		System.out.println(x.get(foto));//--->Retorna o object do Carro
		//Iterando pelas chaves
		Set y = x.keySet();
		//Iterando pelos valores
		Iterator z = (Iterator) x.values().iterator();//-->Todo collection tem o iterator
		
		
	}
}
