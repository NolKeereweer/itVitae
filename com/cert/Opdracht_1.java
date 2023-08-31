/*
 *  Author: Nol Keereweer
 *  Datum latest edit: 31/8/2023
 * 
 *  Main space voor opdrachten eerste week ITVitae. 
 *  
 *  Huidig: Method om ergens anders te callen
 */

package com.cert;

public class Opdracht_1 {

    private static int priveGetal = 2;
    
    public static int getGetal() {
        return priveGetal;
    }

    public static void main(String[] args) {
        System.out.println("Opdracht_1 klasse aangemaakt");
    }


    //practice method aangemaakt om ergens anders te importeren en callen
    public static void doen(){
        String gedaan = "Poging tot halen prive getal";
        System.out.println(gedaan);
    }

}
