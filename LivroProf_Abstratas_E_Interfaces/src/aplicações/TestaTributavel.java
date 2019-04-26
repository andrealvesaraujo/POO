package aplicações;

import java.util.ArrayList;
import java.util.List;

import contas_distintas.*;

public class TestaTributavel {
	public static void main(String args[]){
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000);
		System.out.println(cc.calcularTributo());
		
		//Testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calcularTributo());
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		List A = new ArrayList();
		
		A.add(new ContaCorrente());
		A.add(new ContaCorrente());
		A.add(new SeguroDeVida());
		
		
		for(int i=0;i<A.size();i++){
			if(A.get(i) instanceof ContaCorrente){
				ContaCorrente c1 = (ContaCorrente) A.get(i);
				c1.depositar(50);
			}
			g.adicionarTributo((Tributavel) A.get(i));
			System.out.printf("O saldo é: %.2f\n", g.getTotalDeTributos());
		}
	}
}
