public class Principal {
public static void main(String[] args) {
Caneta c = new Caneta();
c.setCor("preta");
Caneta c2 = new Caneta();
c2.setCor("azul");
c2.setQuantidade(8);
Caneta c3 = new Caneta();
c3.setCor("rosa");
metodoCan1(c);
metodoCan2(c2);
metodoCan3(c3);
int i = c2.getQuantidade();
qtd(i);
System.out.println(i);
System.out.println(c3.getQuantidade());
System.out.println(c.getCor());
System.out.println(c2.getCor());
System.out.println(c3.getCor());
System.out.println(c.getQuantidade());
System.out.println(c2.getQuantidade());
metodoCan4(c, c2);
System.out.println(c.getCor());
System.out.println(c2.getCor());
}
public static void metodoCan1(Caneta c) {
c.setCor("vermelho");
c.setQuantidade(9);
}
public static void metodoCan2(Caneta c) {
c.setQuantidade(32);
c = new Caneta();
c.setCor("verde");
}
public static void metodoCan3(Caneta c) {
c = new Caneta();
c.setCor("laranja");
c.setQuantidade(1);
}
public static void metodoCan4(Caneta c, Caneta c2) {
c=c2;
}
public static void qtd(int i) {
i=i+3;
}
}
