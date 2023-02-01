package edu.neu.csye6200;

public class ExplodableModel {
    Explodable expI ;



    public void display()
    {
        expI = new GunShotI();
        expI.explode();
        expI = new GrenadeI();
        expI.explode();

    }


    @Override
    public String toString() {
        return "ExplodableModel{" +
                "expI=" + expI +
                '}';
    }
}
