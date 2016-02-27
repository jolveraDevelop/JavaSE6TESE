
package modulo4.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestBreaKContinue {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if(i%2 != 0){
//                continue;
//            }
//            if(i == 54){
//                break;
//            }
//            System.out.println("i: "+i);
//        }
        recoreI:
        for (int i = 0; i < 10; i++) {
            recoreJ:
            for (int j = 0; j < 10; j++) {
                if(j==3){
                    continue recoreI;
                }
                if(i==5){
                    break;
                }
                if(i==7){
                    break recoreI;
                }
                    
                System.out.println(j+" "+i);
            }
            
        }
    }
}
