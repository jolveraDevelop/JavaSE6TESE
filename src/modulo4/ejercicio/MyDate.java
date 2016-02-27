/**
 *
 * @author Roberto Olvera
 */

package modulo4.ejercicio;

public class MyDate {
    /**
     * Representa un dia
     */
    private int day;
    /**
     * Representa un mes
     */
    private int month;
    /**
     * Representa un año
     */
    private int year;
    
    public MyDate(){
        
    }
    /**
     * Construye un objeto con valores iniciales para
     * el dia , mes y año
     * @param d Representa el dia
     * @param m Representa el mes
     * @param y Representa el año
     */
    public MyDate(int d,int m, int y){
        day = d;
        month = m;
        year = y;
    }
    
    /**
     * Muestra la fecha en consola
     */
    public void mostrar(){
        System.out.println(day+"/"+month+"/"+year);
    }

    public int getDay() {
        return day; // regresar el valor de la variable day
    }

    public void setDay(int d) {
        // escribir funcionalidad para validar dia correcto
              
        /*
        * si el valor de d esta entre 1 y 31 colocar el valor
        * si no esta en el rango colocar por default 1
        */
        if(d<=31 && d>=1){
             day = d; // colocar el valor del argumento d en day
        }else{
            day=1;
        }   
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }
    
    public void addDays(int moreDays){
        this.day = this.day + moreDays;
    }
    
    /**
     * Retorna el nombre del numero del mes
     * ej. this.month = 2 
     * return Febrero;
     * @return El nombre del mes
     */
    public String getNameMonth(){
        String nameMonth = "";
        switch (this.month) {
            case 1:
                nameMonth = "Enero";
                break;
            case 2:
                nameMonth = "Febrero";
                break;   
            default:
                nameMonth = "Error";
        }
        return nameMonth;
    }
    
     /**
     * Retorna el numero de dias en el mes
     * ej. this.month = 2 
     * return 28;
     * @return El numero del mes
     */
    public int getDaysMonth(){
        int daysMonth = 0;
        final int x = 4;
        switch (this.month) {
            case x:
            case 6:
            case 9:
            case 11:
                daysMonth=30;
                break;
            case 2: 
                daysMonth=28;
                break;
            default:
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysMonth=31;
                break;
        }
        
        return daysMonth;
    }
    
    
}


