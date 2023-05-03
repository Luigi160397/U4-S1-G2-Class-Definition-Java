import java.util.Arrays;

public class Sim {
	int numero;
	double credito = 0.00;
	Chiamata[] listaChiamate = null;
	
	public Sim (int num, double cred, Chiamata[] lista) {
		this.numero = num;
		this.credito = cred;
		this.listaChiamate = lista;
	}
	public Sim(int num) {
        this.numero = num;
        this.credito = 0;
        this.listaChiamate = null;
    }

    public Sim(int num, double credito) {
        this.numero = num;
        this.credito = credito;
        this.listaChiamate = null;
    }
	
	public void stampaSim () {
		String arr = Arrays.toString(this.listaChiamate);
		System.out.println("Numero di telefono: " + this.numero + ", Credito: " + this.credito + " €, Lista Chiamate " + arr);
	}
}
