package boleto;

import java.time.LocalDate;

public class Boleto {
	private int codFatura;
	private float valorBoleto;
	private LocalDate data;

	public int getCodFatura() {
		return codFatura;
	}

	public void setCodFatura(int codFatura) {
		this.codFatura = codFatura;
	}

	public float getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(float valorBoleto) {
		this.valorBoleto = valorBoleto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
