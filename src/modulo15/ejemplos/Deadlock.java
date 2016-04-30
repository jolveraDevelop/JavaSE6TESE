package deadlock;

class A {
  synchronized void foo(B b) {
    String name = Thread.currentThread().getName();
    System.out.println(name + " entra en A.foo");
   try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("A Interrumpido");
    }
    System.out.println(name + " intentando llamar a B.last()");
    b.last();
  }
  synchronized void last() {
    System.out.println("Dentro de A.last");
  }
}
class B {
  synchronized void bar(A a) {
    String name = Thread.currentThread().getName();
    System.out.println(name + " entra en B.bar");
    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("B Interrumpido");
    }
    System.out.println(name + " intentando llamar a A.last()");
    a.last();
  }
  synchronized void last() {
    System.out.println("Dentro de A.last");
  }
}

public class Deadlock implements Runnable {
  A a = new A();
  B b = new B();
  Deadlock() {
    Thread t = new Thread(this, "Mi Hilo");
    t.start();
    a.foo(b); 
    System.out.println("Regreso al hilo principal");
  }
  public void run() {
    b.bar(a); 
    System.out.println("Regreso al otro hilo");
  }
  public static void main(String args[]) {
    new Deadlock();
  }
}
