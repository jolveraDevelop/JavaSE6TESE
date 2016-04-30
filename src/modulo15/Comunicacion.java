package modulo15;

/**
 * 
 * @author Hiroshige
 */


/* La clase Comunicacion2 es la clase principal que nos
 * permitira generar los hilos de ejecución para esta-
 * blecer el ejemplo de comunicacion entre dos hilos 
 * (taxista y pasajero) que acceden al mismo recurso 
 * (la accion que es un envoltorio de un StringBuffer)
 * para poder guardar la conversación.
 */
public class Comunicacion {

    public static void main(String[] args) throws InterruptedException {
        // Creamos la accion y los objetos de tipo Runnable
        Accion a = new Accion(new StringBuilder(""));
        Taxista taxi = new Taxista(a);
        Pasajero pass = new Pasajero(a);
        /* Instanciamos los hilos con la ref de los objetos
         * Runnable ( taxi y pass ) y comenzamos los hilos 
         * respectivamente con sus metodos start.
         */        
        Thread t1 = new Thread(taxi,"Taxista");
        Thread t2 = new Thread(pass,"Pasajero");
        t1.start();
        t2.start();
    }
}
/* Esta clase representa el objeto Envoltorio de un 
 * StringBuilder para poder guardar la conversación
 * se utilizo StringBuilder con el objetivo de ver que
 * el cambio que se hace a la conversacion va sobre 
 * el mismo objeto para poder sincronizarlo. 
 */
class Accion {

    // La variable que guardara la conversacion
    private StringBuilder msg;
    
    // El constructor inicializara la variable
    public Accion(StringBuilder msg) {
        this.msg = msg;
    }

    /* Su metodo getter para poder saber el 
     * estado de la variable que guarda la conver-
     * sacion.
     */
    public StringBuilder getAccion() {
        return msg;
    }
}

/* Esta clase representa al hilo como un taxista
 */
class Taxista implements Runnable {

    /* Esta variable recibira el objeto que envuelve
     * la referencia StringBuilder de la conversacion
     * es decir la que  tanto taxista como pasajero 
     * modificaran en el transcurso de la convversacion
     */
    private Accion accion;

    /* Recibe la referencia del objeto que guarda la 
     * conversacion y la guarda en su propia referencia
     * de estado llamada accion. 
     */
    public Taxista(Accion accion) {
        this.accion = accion;
    }

    /* Metodo que inicia la conversación con el pasajero
     * y en base a notificaciones y esperas establece la 
     * conversacion.
     */
    public void bienvenida() {
        synchronized (accion) {
            String name = Thread.currentThread().getName();
            accion.getAccion().append(name).append(": Bienvenido\n");
            System.out.println(accion.getAccion());
            //Object o = new Object();
            try {
                accion.wait();
             /* Monitorizar un objeto que no fue sincronizado desde
              * otro contexto causara un IllegalMonitorStateException.
              * como aqui pues lo que tenemos monitorizando es un objeto
              * Accion y no un object.
              */
            // o.wait();
             } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
             }
                                   
            accion.getAccion().append(name).append(": claro suba\n");
            System.out.println(accion.getAccion());
            accion.notify();
            try {                
             accion.wait();
             } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            accion.getAccion().append(name).append(": Ya llegamos al aeropuerto\n");
            System.out.println(accion.getAccion());
            accion.notify();
            
            
        }
    }

    /* Metodo para incrustar lo que realizara el hilo
     * cuando se invoque al metodo start, es decir co-
     * menzar la conversacion.
     */
    @Override
    public void run() {
        bienvenida();
    }
}

/* Esta clase representa al hilo como un pasajero
 */
class Pasajero implements Runnable {

    /* Recibe la referencia del objeto que guarda la 
     * conversacion y la guarda en su propia referencia
     * de estado llamada accion. 
     */
    private Accion accion;

    
    /* Recibe la referencia del objeto que guarda la 
     * conversacion y la guarda en su propia referencia
     * de estado llamada accion. 
     */
    public Pasajero(Accion accion) {
        this.accion = accion;
    }

    /* Metodo que continua la conversación con el taxista
     * en base a notificaciones y esperas la modifica.
     */
    public void abordar() {
        synchronized (accion) {
            String name = Thread.currentThread().getName();
            accion.getAccion().append(name).append(": Me lleva al aeropuerto\n");
            System.out.println(accion.getAccion());
            accion.notify();            
             try {
             accion.wait();
             } catch (InterruptedException ex) {
             System.err.println(ex.getMessage());
             }
            accion.getAccion().append(name).append(": Gracias apurese que llevo prisa\n");
            System.out.println(accion.getAccion());
            accion.notify();            
            try {
             accion.wait();
            } catch (InterruptedException ex) {
             System.err.println(ex.getMessage());
            }
            accion.getAccion().append(name).append(": Gracias");
            System.out.println(accion.getAccion());            
            
        }
    }

    
    /* Metodo para incrustar lo que realizara el hilo
     * cuando se invoque al metodo start, es decir con-
     * tinuar la conversacion.
     */
    @Override
    public void run() {
        abordar();
    }
}