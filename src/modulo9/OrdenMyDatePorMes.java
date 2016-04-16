
package modulo9;

import java.util.Comparator;
import modulo6.MyDate;


/**
 *
 * @author Roberto Olveras
 */
public class OrdenMyDatePorMes implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        MyDate fecha1 = null;
        MyDate fecha2 = null;
        
        if(o1 instanceof MyDate && o2 instanceof MyDate ){
            fecha1 = (MyDate)o1;
            fecha2 = (MyDate)o2;
        }else{
            throw new IllegalArgumentException("El objeto no es un MyDates");
        }
        
        if(fecha1.getMonth() > fecha2.getMonth()){
            return 1;
        }else if(fecha1.getMonth() < fecha2.getMonth()){
            return -1;
        }else{
            return 0;
        }
       
    }

}
