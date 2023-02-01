package edu.neu.csye6200;

public class ExplosionModel {

    Explosion exp;




    public void display()
    {
        exp = new GunShot();
        exp.explode();
        exp = new Grenade();
        exp.explode();

    }

    @Override
    public String toString() {
        return "ExplosionModel{" +
                "exp=" + exp +
                '}';
    }
}
