package es.upm.miw.pd.ecp1.operaciones;

public abstract class Operator {

	protected final int operator1, operator2;

	public Operator(final int operator1, final int operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;
	}

	public int getOperator1() {
		return operator1;
	}

	public int getOperator2() {
		return operator2;
	}
	
    public abstract String toString();

	public abstract int operate();

}
