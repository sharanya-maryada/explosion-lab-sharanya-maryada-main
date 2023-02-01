package edu.neu.csye6200;

public class ExplosionObjectModel {
    static Object o ;

    // private List<Object> ObjectList = new ArrayList<>();

    public static void display()
    {
        o = new GunShot();
        System.out.println(o.toString());

        o= new Grenade();
        System.out.println(o.toString());
        o = new GunShotA();
        System.out.println(o.toString());
        o= new GrenadeA();
        System.out.println(o.toString());
        o = new GunShotI();
        System.out.println(o.toString());
        o= new GrenadeI();
        System.out.println(o.toString());

    }

    public static void demo()
    {
        ExplosionModel em =new ExplosionModel();
        em.display();
        AbstractExplosionModel aem = new AbstractExplosionModel();
        aem.display();
        ExplodableModel emi = new ExplodableModel();
        emi.display();
        display();

    }
}
