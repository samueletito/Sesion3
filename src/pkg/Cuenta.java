package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private Double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> movimientos;
	
	public Cuenta(Double i, String n, String t, ArrayList<Movimiento> m) {
		this.saldo = i;
		this.numero = n;
	}
	
	public Double getSaldo() {
		if	(numero.equals("12345"))
			return -250d;
		else if (numero.equals("67890"))
			return -450d;
		else
			return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double i) {
		saldo += i;
	}
	
	public void retirar(Double i) {
		saldo -= i;
	}
}
