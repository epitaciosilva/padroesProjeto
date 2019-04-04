package chain;

public abstract class BancoChain {

	protected BancoChain next;
	protected IDBancos identificadorDoBanco;

	public BancoChain(IDBancos id) {
		next = null;
		identificadorDoBanco = id;
	}

	public void setNext(BancoChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void efetuarPagamento(IDBancos id) throws Exception {
		if (identificadorDoBanco == id) {
			efetuaPagamento();
		} else {
			if (next == null) {
				throw new Exception("banco não cadastrado");
			}
			next.efetuarPagamento(id);
		}
	}

	protected abstract void efetuaPagamento();

}