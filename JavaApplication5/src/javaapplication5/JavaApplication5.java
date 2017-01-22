/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author ludovic-castro
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        repertoire racine = new repertoire("D");
        repertoire document = new repertoire("document");
        repertoire multimédia = new repertoire("multimedia");
        repertoire videos = new repertoire("videos");
        repertoire images = new repertoire("images");
        repertoire pictures = new repertoire("pictures");
        repertoire web = new repertoire("web");
        repertoire animaux = new repertoire("animaux");
        repertoire chien = new repertoire("chien");
        repertoire photos = new repertoire("photos");
        repertoire deuxMilleDouze = new repertoire("2012");
        repertoire deuxMilleVinght = new repertoire("2020");
        
        racine.addChildren(multimédia);
        racine.addChildren(document);
        multimédia.addChildren(videos);
        multimédia.addChildren(images);
        racine.afficheNom();
        // Afiche le nom de mon object new repertoire("D");
        //System.out.println(racine.nom + ":");
        //affichage de l'arborescence 
        // repertoire 1 
        //for (repertoire repertoire1 : racine.repertoires) {
            //System.out.println("\t" + repertoire1.nom);
    //}
    }
}
