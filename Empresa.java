package PatrimonioEmpresa;

import java.util.Date;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private Date dataAbertura= new Date("22,2,2002");
	
	private AtivoPatrimonial at = new AtivoPatrimonial();
	private PassivoPatrimonial ps = new PassivoPatrimonial();
	private List<Empresa> emprestimo;

	public double calculoDre() {
		return 0.0;
	}

}
