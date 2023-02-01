package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class AbstractExplosionModel {

    AbstractExplosion aem;


    public void display() {
        aem = new GunShotA();
        aem.explode();
        aem = new GrenadeA();
        aem.explode();

    }


    @Override
    public String toString() {
        return "AbstractExplosionModel{" +
                "aem=" + aem +
                '}';
    }
}
