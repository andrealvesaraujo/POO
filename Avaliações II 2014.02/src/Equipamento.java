
public class Equipamento {

	public static void ligar() {
	
		try{
			//Utils.ligar();
			if(!true/*Utils.ligar();*/){
				throw new EquipamentoDesligadoException("ERRO � falso");
			}
			
		}
		catch(EquipamentoDesligadoException e){
			System.out.println(e.getMessage());
		}
	}

}