package aplicações;
import exercicio.FuncionarioModificado;
import exercicio.EmpresaModificado;

public class NovoTesteFuncionario {

	public static void main(String[] args) {
		FuncionarioModificado F = new FuncionarioModificado();
		FuncionarioModificado F2 = new FuncionarioModificado();
		FuncionarioModificado F3 = new FuncionarioModificado();
		FuncionarioModificado F4 = new FuncionarioModificado();
		F.setNome("Sora");
		F.setDep("Tecnologia"); F.setSal(5000.10);
		System.out.println(F.getNome() +"  " + F.getIdent());
		System.out.println(F3.getIdent());
		
		
	}

}
