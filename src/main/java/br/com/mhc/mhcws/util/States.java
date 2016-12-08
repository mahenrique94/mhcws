package br.com.mhc.mhcws.util;

public enum States {

	FIND("FIND", 0),
	RO("RO", 11),
	AC("AC", 12),
	AM("AM", 13),
	RR("RR", 14),
	PA("PA", 15),
	AP("AP", 16),
	TO("TO", 17),
	MA("MA", 21),
	PI("PI", 22),
	CE("CE", 23),
	RN("RN", 24),
	PB("PB", 25),
	PE("PE", 26),
	AL("AL", 27),
	SE("SE", 28),
	BA("BA", 29),
	MG("MG", 31),
	ES("ES", 32),
	RJ("RJ", 33),
	SP("SP", 35),
	PR("PR", 41),
	SC("SC", 42),
	RS("RS", 43),
	MS("MS", 50),
	MT("MT", 51),
	GO("GO", 52),
	DF("DF", 53);
	
	private String uf;
	private int codigo;
	
	public String getUf() {
		return uf;
	}
	public int getCodigo() {
		return codigo;
	}
	
	private States(String uf, int codigo) {
		this.uf = uf;
		this.codigo = codigo;
	}
	
	public int getStateCod(String uf) {
		for (States state : States.values()) {
			if (state.getUf().equals(uf))
				return state.getCodigo();
		}
		return 0;
	}
	
}
