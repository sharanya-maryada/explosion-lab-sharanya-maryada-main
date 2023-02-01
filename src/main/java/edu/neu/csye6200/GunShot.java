package edu.neu.csye6200;

public class GunShot extends Explosion {

    @Override
    public void explode()
    {
        System.out.println("GunShot Exploded.");
    }

    @Override
    public String toString() {
        return "Inside GunShot{}";
    }
}
