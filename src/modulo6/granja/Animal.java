
package modulo6.granja;

/**
 *
 * @author Roberto Olveras
 */
public abstract class Animal<X> {
    
    X name;
    
    public abstract void sonido();
    public abstract void comer();
    public abstract void formaNacer();
    
    public Animal(String s){
        
    }    
    
    public boolean estoyVivo(){
        // validar
        return true;
    }

    public void setName(X name) {
        this.name = name;
    }

    public X getName() {
        return name;
    }
    
    public void mostrarNombre(){
        System.out.println(name.toString());
    }
            
    
    
            
}
