package chain;

public class Cliente {
	public static void main(String[] args) {
		BancoChain bancos = new BancoA();
		bancos.setNext(new BancoB());
		
		try {
			bancos.efetuarPagamento(IDBancos.bancoA);
			bancos.efetuarPagamento(IDBancos.bancoB);
			bancos.efetuarPagamento(IDBancos.bancoC);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
