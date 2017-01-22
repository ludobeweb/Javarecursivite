/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ludovic-castro
 */
public class repertoire {
    public String nom = "";
    public repertoire parent = null;
    List <repertoire> repertoires = new ArrayList();
    
    public repertoire(String nom){
        this.nom = nom;
    }
    
    public void addChildren(repertoire r){
        r.parent = this;
        this.repertoires.add(r);
    }
    
    public void afficheNom(){
        //PROBLEME dans l'ordre d'affichage.
        System.out.println(this.nom);
        for (repertoire repertoire : repertoires) {
            repertoire.afficheNom();
        }
    }
    
    //Pourquoi on utilise cette methode la?
    public int getIndent(){
        //il manque quelque chose ici.
        return this.parent.getIndent()+1;
    }
    
    //une tabulation = \t
    //le nombre de tabulation correspond au nombre de parent.
    public String indentation(){
     return this.nom;
        
    }
} 