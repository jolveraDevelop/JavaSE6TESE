
package modulo6;

/**
 *
 * @author Roberto Olveras
 */
public class Calculadora {
    
    public double sumar(double op1, double op2){
        return op1+op2;
    }
    
    private int sumar(double op1, double op2, double op3){
        return (int)(op1+op2+op3);
    }
    
    public double sumar(double... operandos) {
        double result = 0;
        for (double op : operandos) {
            result += op;
        }
        return result;
    }
}
