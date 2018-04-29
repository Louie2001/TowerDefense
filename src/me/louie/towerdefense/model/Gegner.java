/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.louie.towerdefense.model;

/**
 *
 * @author walle
 */
public class Gegner {
    /**
     * Gibt die Breite des Objekts an.
     */
    private int X;       
    /**
     * Gibt die Höhe des Objekts an.
    */
    private int Y;
    /**
     * Gibt die Anzahl der Pixel an die in einer Sekunde zurückgelegt werden.
     */
    private int geschwindigkeit;
    /**
     * Gibt die Farbe des Objekts an.
     */
    private String Farbe;
    /**
     * Gibt an wie oft das Objkekt getroffen werden darf bevor es zerstört wird.
     */
    private int HP;
    /**
     * Gibt an wie viele Punkte man bekommt wenn das OBjekt zerstört wird.
     */   
    private int PunkteBelohnung;
    
    public Gegner(int X,int Y,int geschwindigkeit,String Farbe,int HP){
        this.X = X;
        this.Y = Y;
        this.geschwindigkeit = geschwindigkeit;
        this.Farbe = Farbe;
        this.HP = HP;
    }
    
    
    
}
