
public class NamedThreadsTest {

	public static void main(String[] args) {
		MyThread primeira = new MyThread("primeira....");
		MyThread segunda = new MyThread("segunda....");
		MyThread terceira = new MyThread("terceira....");
		MyThread quarta = new MyThread("quarta....");
		MyThread quinta = new MyThread("quinta....");
		primeira.start();
		segunda.start();
		terceira.start();
		quarta.start();
		quinta.start();
		//Não segue um padrão de saida agora se fosse so o primeira.run() ocorre na ordem.
		
	}

}
