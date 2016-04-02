
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class Marciano {
    public static Integer totalMarcianosEnCombate = 0;
    
    private String nombre;

    public Marciano() {
        totalMarcianosEnCombate++;
    }
    
    public void valentia(){
        if(totalMarcianosEnCombate>3){
            System.out.println("valiente");
        }else{
            System.out.println("cobardes");
        }
    }    
    
}
