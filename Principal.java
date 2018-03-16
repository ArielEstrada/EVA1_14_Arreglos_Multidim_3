/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] MatrizCuat = new int[4][4][4][4];
        for (int i = 0; i < MatrizCuat.length; i++) {//Primera dimencion
            for (int j = 0; j < MatrizCuat[i].length; j++) {//segunda dimencion
                for (int k = 0; k < MatrizCuat[i][j].length; k++) {//Tercera dimencion
                    for (int l = 0; l < MatrizCuat[i][j][k].length; l++) {//Cuarta dimencion
                        MatrizCuat[i][j][k][l] = (int)(Math.random()*100);
                    }
                }
            }
        }
        for (int i = 0; i < MatrizCuat.length; i++) {//Primera dimencion
            for (int j = 0; j < MatrizCuat[i].length; j++) {//segunda dimencion
                for (int k = 0; k < MatrizCuat[i][j].length; k++) {//Tercera dimencion
                    for (int l = 0; l < MatrizCuat[i][j][k].length; l++) {//Cuarta dimencion
                        System.out.print(MatrizCuat[i][j][k][l]);
                    }System.out.println("");
                }
            }
        }
        
    }
    
}
