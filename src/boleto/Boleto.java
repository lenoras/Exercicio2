package boleto;

import java.util.Date;

public class Boleto {
	private static int count = 0;
	private int boletoID;
	private int codFatura;
	private float valorBoleto;
	Date data = new Date();
	private boolean isFilled;
	
	public Boleto( int codFatura, float valorBoleto) {
		this.codFatura = codFatura;
		this.valorBoleto = valorBoleto;
		isFilled = false;
		boletoID = ++count;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Boleto.count = count;
	}

	public int getBoletoID() {
		return boletoID;
	}

	public void setBoletoID(int boletoID) {
		this.boletoID = boletoID;
	}

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
