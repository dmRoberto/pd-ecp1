package es.upm.miw.pd.ecp1.operaciones;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    List <Operator> operations = new ArrayList<Operator>();

    public void add(Operator operator) {
    	operations.add(operator);
    }

    public void reset() {
    	operations.clear();
    }

    public int total() {
       
        int result = 0;
        String separator = "";
        for (Operator operator : operations){
        	System.out.print(separator + operator.toString());
        	result += operator.operate();
        }
        System.out.print(">>> ");
        return result;
    }
}
