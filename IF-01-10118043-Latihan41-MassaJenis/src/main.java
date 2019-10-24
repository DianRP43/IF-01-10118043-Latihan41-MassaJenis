/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus k = new Kubus();
        k.setSisi(5);
        k.setMassa(250);
        System.out.println("sisi\t\t: "+k.getSisi());
        System.out.println("Massa\t\t: "+k.getMassa()+"\n");
        System.out.println("volume\t\t: "+k.hitungVolume(0));
        System.out.println("Massa Jenis\t: "+k.hitungMassaJenis(0, 0));
    }
    
}
