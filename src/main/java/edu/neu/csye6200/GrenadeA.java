package edu.neu.csye6200;

public class GrenadeA extends AbstractExplosion {

    @Override
    public void explode() {
        System.out.println("GrenadeA Exploded.");
    }

    @Override
    public String toString() {
        return "Inside GrenadeA{}";
    }
}