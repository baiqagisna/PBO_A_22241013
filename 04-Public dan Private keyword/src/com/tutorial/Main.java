package com.tutorial;

class player {
    // Data Member
    String name;//default, bisa dibaca dan dituis diluar class
    public int exp;// public, bisa dibaca dan ditulis diluar class
    private int health;//private, hanya bisa dibaca oleh class itu sendiri


    // kosntruktor
    player( String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }
    
    void display(){
        System.out.println("Hero 1 : " + this.name);
        System.out.println("Hero Health : " +  this.health);
        System.out.println("Hero EXP " + this.exp);
    }
}



public class Main {

    public static void main(String[] args) {
        //membuat objek atau instansiasi objek 
        player hero_1 = new player("agisna", 17, 30);

        // default
        System.out.println(hero_1.name);
        hero_1.name = "jungkook";
        System.out.println(hero_1.name);

        // public
        System.out.println(hero_1.exp);
        hero_1.exp = 37;
        System.out.println(hero_1.exp);

        // private
        hero_1.display();

    }
        
}
