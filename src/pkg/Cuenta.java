package pkg;

public class Cuenta {
	
	private Double saldo;
	
	public Cuenta(Double i) {
		this.saldo = i;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double i) {
		saldo += i;
	}
}
