package aplicações;

import exercicio.DataModificado;
import exercicio.EmpresaModificado;
import exercicio.FuncionarioModificado;

public class TestEmpresaMod {
	public static void main(String args[]){

		FuncionarioModificado F1= new FuncionarioModificado();
		FuncionarioModificado F2 = new FuncionarioModificado();
		FuncionarioModificado F3 = new FuncionarioModificado();
		DataModificado D = new DataModificado(38,5,1994);
		
		F1.setNome("Breno");
		F1.setSal(10000);
		F2.setDep("TI");
		F2.setSal(3000);
		
		EmpresaModificado M = new EmpresaModificado();
		EmpresaModificado m = new EmpresaModificado(5);
		
		F3.setRG("3232342423");
		F3.setNome("Daniel");
		F3.setEntrada(D);
		m.adiciona(new FuncionarioModificado("Sdofdsdfsdfsdf"));
		m.adiciona(new FuncionarioModificado("Pedro"));
		m.adiciona(F3);
		
		M.setEmpregados(new FuncionarioModificado [10]);
		
		M.adiciona(F1);
		M.adiciona(F2);
		
		for(int i=0;i<3;i++)
		{
			FuncionarioModificado resto = new FuncionarioModificado();
			resto.setSal(i*2000+100);
			M.adiciona(resto);
		}
		M.mostraEmpregados();
		m.mostraEmpregados();
		F3=F2;
		if(M.contemFunc(F3))
		{
			System.out.println("TEM");
		}
		else
		{
			System.out.println("N tem");
		}
	

	}
}
