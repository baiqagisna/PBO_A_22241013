package com.tutorial;

class hero{
    //att
    String nama;
    float exp;
    float health;

    void display(){
        System.out.println("nama Hero :" + this.nama);
        System.out.println("exp Hero :" + this.exp);
        System.out.println("health Hero :" + this.health);
    }

}

//subclass
class HeroTank extends hero{

}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        hero hero_1 = new hero();
        hero_1.nama = "zilong";
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.nama = "Miya" ; 
        hero_2.display();
        

    }
}
