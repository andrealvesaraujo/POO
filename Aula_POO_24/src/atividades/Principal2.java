package atividades;

import selvagens.*;

public class Principal2 {
	public static void main(String[] args){
		Gato[] corrida = new Gato[3];
		//corrida[0].miar();//NULL point exception.Pois são 3 gatos com valor null
		corrida[0] = new Gato();
		corrida[1] = new Gato();
		corrida[2] = new Gato();
		
		for(int i=0;i<corrida.length; i++)
		{
			corrida[i].correr();
		}
		
	}
}
