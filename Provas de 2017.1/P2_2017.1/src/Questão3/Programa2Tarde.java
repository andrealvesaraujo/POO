package Questão3;

public class Programa2Tarde {
	public static void main(String args[]){
		Panela p = new Panela();// p =(cor,qtd,preço)
		p.setCor("amarelo");// p=(amarelo,0,0)
		Panela p2 = new Panela();
		p.setCor("preto");//p2 = (preto,0,0)
		p2.setQuantidade(101);// p2 = (preto,101,0)
		metodoA(p);////p=(azul,10,0)
		System.out.println(p.getCor());//Sai azul
		System.out.println(p.getQuantidade());//Sai 10
		metodoB(p2,p);//p=(rosa,3,0) e p2=(preto,10,0)
		System.out.println(p.getCor());//sai rosa
		System.out.println(p2.getCor());//sai preto
		int i=190;
		qqq(i);
		System.out.println(i);//190
		int j=150;
		qqq3(i,j);
		System.out.println(i);//150
		System.out.println(j);//190
	}
	public static void metodoA(Panela p2){
		new Panela();//Inutil
		p2.setCor("azul");//p=(azul,0,0)
		p2.setQuantidade(10); //p=(azul,10,0)
	}
	public static void metodoB(Panela p9,Panela p10){//p9==p2 e p10==p
		Panela p11 = p9;
		p11.setQuantidade(3);
		p11.setCor("rosa");
		p9=p10;
		p10=p11;
		p9.setCor("preto");
	}
	public static int qqq(int i){
		i=i+666;
		i=15;
		return i;
	}
	public static void qqq3(int j,int i){
		int k=j;
		j=i;
		i=k;
		
	}
		
}
