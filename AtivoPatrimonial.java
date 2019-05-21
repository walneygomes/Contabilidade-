package PatrimonioEmpresa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtivoPatrimonial {
	private Map<String, Double> bens = new HashMap<String, Double>();
	private Map<String, Double> direitos = new HashMap<String, Double>();
	// investimento inicial do dono da empresa
	private double capital;

	public AtivoPatrimonial() {

	}

	public AtivoPatrimonial(double capital) {
		this();
		this.capital = capital;
	}

	private Double obterSoma(Collection<Double> collection1, Collection<Double> collection2) {
		Double soma = 0.0;
		for (Double s : collection1) {
			soma += s;

		}
		for (Double d : collection2) {
			soma += d;
		}

		return soma;

	}

	public void addBens(String tipoBens, double valorBens) {
		bens.put(tipoBens, valorBens);

	}

	public void addDireitos(String tipoReceber, double valorReceber) {
		direitos.put(tipoReceber, valorReceber);

	}

	public void imprimirTabela() {
		System.out.println("========DadosAtivo=============");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("Bens ====== valor");
		System.out.println(bens.toString());
		System.out.println("");
		System.out.println("Direitos ====== valor");
		System.out.println(direitos.toString());
		System.out.println("================================");
		System.out.println("SomaAtivo = " + obterSoma(bens.values(), direitos.values()) + " R$");
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

}
