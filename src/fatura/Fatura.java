package fatura;

import java.util.Date;
import java.util.List;

import pagamento.Pagamento; 

public class Fatura {
	private String nomeCliente;
	private float valorTotal;
	Date data = new Date();
	private List<Pagamento> listaPagamento;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Pagamento> getListaPagamento() {
		return listaPagamento;
	}
	public void setListaPagamento(List<Pagamento> listaPagamento) {
		this.listaPagamento = listaPagamento;
	}
	
}
