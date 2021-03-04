package processadorBoleto;

import java.util.ArrayList;
import java.util.List;

import fatura.Fatura;
import boleto.Boleto;
import pagamento.Pagamento;

public class ProcessadorBoleto {
	private Fatura fatura;
	private List<Pagamento> pagamentos = new ArrayList<>();

	public float processarFatura(List<Boleto> listaBoleto, float valorFinal) {
		fatura = new Fatura();
		fatura.setValorTotal(0);
		listaBoleto.forEach(novoBoleto -> {
			Pagamento pagamento = new Pagamento();
			pagamento.setValorPago(novoBoleto.getValorBoleto());
			pagamento.setData(novoBoleto.getData());
			pagamento.setTipo("boleto");
			pagamentos.add(pagamento);
			fatura.setValorTotal(fatura.getValorTotal() + pagamento.getValorPago());
		});
		fatura.setListaPagamento(pagamentos);
		return fatura.getValorTotal();
	}

}
