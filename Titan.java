/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

/**
 *
 * @author abiyy
 */
public class Titan extends Character{
    private int defense;
    private int attack;
    private int HP;
 
    Titan(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    @Override
    public boolean attack(){
        double Hit = Math.random();
    return Hit < 0.40;
    }  
}
