package fatura;

import java.util.*;

import boleto.Boleto; 

public class Fatura {
	private static int count = 0;
	private int faturaId;
	private String nomeCliente;
	private float valorTotal;
	Date data = new Date();
	private ArrayList<Boleto> prestacoes = new ArrayList();
	private boolean isFilled;
	
	public Fatura (String nomeCliente, float valorTotal) {
		this.nomeCliente = nomeCliente;
		this.valorTotal = valorTotal;
		isFilled = false;
		faturaId = ++count;
	}
}
