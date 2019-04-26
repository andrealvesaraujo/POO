

public class Test {
	public static void main(String[] args){
	/*	
		byte c = 19;
		int i=2662205;
		c=(byte)i;
		System.out.println(c);
		long cpf=18097453245L;
		System.out.println(cpf);
		float f =15.5f;
		if(10>5){
			System.out.println(4);
		}
		int l=5;
		int k=l++;
		int j=++l;
	*/	
		
		int cont=0;
		
		Cliente F = new Cliente();
		Conta h = new Conta();
		h.numero=56;
		h.depositar(150.45);
		h.cliente=F;
		h.cliente.nome="Balrog";
		Cliente J = h.cliente;
		J.cpf="394394949-32";
		
		while(h.saldo > 0 ){
			h.sacar(50);
			
			cont++;

		}
		h.sacar(50);
		System.out.println("Sacou : "+cont);
	}
}
