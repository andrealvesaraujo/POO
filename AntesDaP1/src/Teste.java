public class Teste {
public static void main(String[] args) {
Acessorio a = new Acessorio("Vidro elétrico");
Acessorio b= new Acessorio("Alarme");
metodo1(a,b);
System.out.println(a.getNome());
System.out.println(b.getNome());
metodo2(b,a);
System.out.println(a.getNome());
System.out.println(b.getNome());
}
private static void metodo2(Acessorio b, Acessorio a) {
b.setNome("Som automotivo");
a=b;
a.setNome("Ar condicionado");
System.out.println(b.getNome());
a=new Acessorio("Direção hidráulica");
}
private static void metodo1(Acessorio a, Acessorio b) {
b=a;
a.setNome("Freio ABS");
a=new Acessorio("Travas elétricas");
}
}