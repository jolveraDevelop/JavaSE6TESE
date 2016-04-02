
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class BloquesStaticos {

    public BloquesStaticos() {
        System.out.println("BloquesStaticos()");
    }
    
    {
        System.out.println("bloque 1");
    }
    {
        System.out.println("bloque 2");
    }
    
    static{
        System.out.println("static bloque 1");
    }
    static{
        System.out.println("static bloque 2");
    }
}
