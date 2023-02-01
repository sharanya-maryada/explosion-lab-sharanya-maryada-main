package edu.neu.csye6200;

public class GunShotI implements Explodable{


    @Override
    public void explode(){
        System.out.println("GunshotI Exploded");

    }

    @Override
    public String toString() {
        return "Inside GunShotI{}";
    }
}
