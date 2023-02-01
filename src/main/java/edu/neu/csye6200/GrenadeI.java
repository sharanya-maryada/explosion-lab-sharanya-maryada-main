package edu.neu.csye6200;

public class GrenadeI implements Explodable {
    @Override
    public void explode() {
        System.out.println(" GrenadeI Exploded.");
    }

    @Override
    public String toString() {
        return "Inside GrenadeI{}";
    }
}
