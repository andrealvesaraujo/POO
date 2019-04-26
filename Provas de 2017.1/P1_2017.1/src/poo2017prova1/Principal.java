package poo2017prova1;

public class Principal {
public static void main(String[] args) {
Quadro c = new Quadro();
c.setCor("branco");
Quadro c2 = new Quadro();
c2.setCor("verde");
c2.setQuantidade(8);
Quadro c3 = new Quadro();
c3.setCor("marron");
metodoA(c);
metodoB(c2);
metodoC(c3);
int i = c2.getQuantidade();
qtd(i);
System.out.println(i);
System.out.println(c.getCor());
System.out.println(c2.getCor());
System.out.println(c3.getCor());
System.out.println(c.getQuantidade());
System.out.println(c2.getQuantidade());
metodoD(c, c2);
System.out.println(c.getCor());
System.out.println(c2.getCor());
metodoD(c, c);
System.out.println(c.getCor());
System.out.println(c2.getCor());
}
public static void metodoA(Quadro c) {
c.setCor("lilás");
c.setQuantidade(9);
}
public static void metodoB(Quadro c) {
c.setQuantidade(32);
c = new Quadro();
c.setCor("coral");
}
public static void metodoC(Quadro c) {
c = new Quadro();
c.setCor("roxo");
c.setQuantidade(1);
}
public static void metodoD(Quadro c, Quadro c2) {
c=c2;
c.setCor("cinza");
}
public static void qtd(int i) {
i=i+4;
}
}
 