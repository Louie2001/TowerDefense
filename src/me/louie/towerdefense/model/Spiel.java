/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.louie.towerdefense.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author walle
 */
public class Spiel {
    /**
     * Gibt an in welcher Welle sich das Spiel befindet.
     * 
     */
    public static int Welle;
    /**
     * Gibt an ob das Spiel beendet wurde.
     */
    public static boolean beendet;
    /**
     * Alle Gegner im Spiel.
     */
    public static List<Gegner> AlleGegner = new LinkedList<Gegner>();
    /**
     * Alle Tower im Spiel.
     */
    public static List<Tower> AlleTower = new LinkedList<Tower>(); 
    public Spiel(){
        Welle = 0;
        beendet = false;
                   
    }
    
    
    
    
    
    
    
    
    
    
}
