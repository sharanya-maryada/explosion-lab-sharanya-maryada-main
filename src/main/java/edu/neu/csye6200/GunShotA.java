package edu.neu.csye6200;

public class GunShotA extends AbstractExplosion{

    @Override
    public void explode() {
        System.out.println("GunShotA Exploded.");
    }

    @Override
    public String toString() {
        return "Inside GunShotA{}";
    }
}
