package edu.neu.csye6200;

public class Grenade extends Explosion{

    @Override
    public void explode()
    {
        System.out.println("Grenade Exploded.");
    }

    @Override
    public String toString() {
        return "Inside Grenade{}";
    }
}
