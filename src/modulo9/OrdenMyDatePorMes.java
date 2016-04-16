
package modulo9;

import java.util.Comparator;
import modulo6.MyDate;


/**
 *
 * @author Roberto Olveras
 */
public class OrdenMyDatePorMes implements Comparator<MyDate>{

    @Override
    public int compare(MyDate fecha1, MyDate fecha2) {      
        if(fecha1.getMonth() > fecha2.getMonth()){
            return 1;
        }else if(fecha1.getMonth() < fecha2.getMonth()){
            return -1;
        }else{
            return 0;
        }
       
    }

}
