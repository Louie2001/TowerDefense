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
public class Tower {

    /**
     * Gibt an wie breit das Objekt werden soll.
     */
    private int X;
    /**
     * Gibt an wie hoch das Objekt werden soll.
     */
    private int Y;
    /**
     * Gibt an ob das Objekt zerstört wurde.
     */

    private boolean zerstört;
    /**
     * Gibt die Reichweite in der Breite vom Mittelpunkt in eine Richtung an.
     */
    private int SchussX;
    /**
     * Gibt die Reichweite in der Höhe vom Mittelpunkt in eine Richtung an.
     */
    private int SchussY;
    /**
     * Gibt an wie viele Schüsse pro Sekunde gefeuert werden können.
     */
    private int SchüsseProSekunde;

    public Tower(int X, int Y, int SchussX, int SchussY, int SchüsseProSekunde) {
        this.X = X;
        this.Y = Y;
        this.SchussX = SchussX;
        this.SchussY = SchussY;
        this.SchüsseProSekunde = SchüsseProSekunde;

        zerstört = false;

    }

}
