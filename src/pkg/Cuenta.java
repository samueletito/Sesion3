package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Tipo;

public class Cuenta {
	
	private Double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> movimientos;
	
	public Cuenta(Double i, String n, String t, ArrayList<Movimiento> m) {
		this.saldo = i;
		this.numero = n;
		this.titular = t;
		this.movimientos = m;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double i) {
		saldo += i;
		movimientos.add(new Movimiento(i, Tipo.H));
	}
	
	public void retirar(Double i) {
		if (saldo - i >= -500) {
			saldo -= i;
			movimientos.add(new Movimiento(i, Tipo.D));
		}
	}
}
