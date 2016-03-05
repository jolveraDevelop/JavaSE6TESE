
package modulo5.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestArrayMultidimencional {
    public static void main(String[] args) {
        int multi [][] = new int[3][2];
        multi[0][0] = 5;
        int multi2[][] = {{1,2},{3,4},{5,6}};
        //System.out.println(multi2[1][1]);
        
        int [][] invalido = {{2,2}};
        int [] otroInvalido [] = new int[2][2];
        
        int [][] multi3 = new int[3][];
        multi3[0] = new int[4];
        multi3[1] = new int[1];
        multi3[2] = new int[3];
        
        multi3[1][0] = 8;
        
        int [][] multi4 = {{2,6,4,7},{5},{1,4,0}};
        
//        int x[] = {3,4,3};
//        multi3[2] = x;
        
    }
}
