package es.upm.miw.pd.ecp1.operaciones;

public class Subtraction extends Operator {
	
    public Subtraction(int operator1, int operator2) {
		super(operator1, operator2);
	}

	private int subtract() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }

	@Override
	public int operate() {
		return subtract();
	}

}
