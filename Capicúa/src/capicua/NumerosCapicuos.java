/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

/**
 *
 * @author carli
 */
public class NumerosCapicuos {
  private int cent, dec, uni, com, mil;
  private int num;

  public NumerosCapicuos(int num){
  this.num = num;
  }

    public void sacarUnid(){
        uni = num%10;
        com = num/10;
        dec = com%10;
        com = com/10;
        cent = com%10;
        mil = com/10;
    }
    
    public void compararNum(){
        if (uni == mil && cent == dec) {
            System.out.println("El número: "+ mil + ""+ cent +""+ dec +""+ uni + " es capicua");
        } else if (cent == uni && mil == 0) {
            System.out.println("El número: " + cent +""+ dec +""+uni+" es capicua");
        } else if ( dec == uni && cent == 0 && mil == 0){
            System.out.println("El número: " + dec + ""+ uni+ " es capicua");
        } else {
            System.out.println("El número no es capicua");
        }
    }
}

  
  
          
    
        
        
          
