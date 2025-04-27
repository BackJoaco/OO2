package com.patterns;

public class TopografiaMixta implements Topografia{
    private Topografia[] topografias;
    public TopografiaMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
        this.topografias = new Topografia[4];
        this.topografias[0] = t1;
        this.topografias[1] = t2;
        this.topografias[2] = t3;
        this.topografias[3] = t4;
    }
    public double calcularProporcion() {
        double proporcion = 0;
        for (Topografia topografia : topografias) {
            proporcion += topografia.calcularProporcion();
        }
        return proporcion / 4;
    }

    public boolean somosIguales(Topografia t) {
        return t.equals(this);
    }
}
