
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario f1 =new Funcionario();
		Funcionario f2 =new Funcionario();
		Funcionario f3;
		
		f1.nome="Joao";f1.sal=1500.50; f1.rg="17589853";
		//f1.recebeAumento(500.75);
		f2.nome="Joao";f2.sal=1500.50; f2.rg="17589853";
		f3=f1;
		
		if(f1==f2)
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");
		if(f1==f3)
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");
		Data dataEntrada = new Data();
		dataEntrada.d=4;
		dataEntrada.m=7;
		dataEntrada.a=1996;
		f1.entrada=dataEntrada;
		f1.mostra();

	}

}
