package ru.innopolis.stc12.proxy;

public class Capucin extends Monkey {
    private final int tailLength = 40;
    public int charming;
    protected int harmfull;
    private int footSize;

    public Capucin(int charming, int harmfull, int footSize) {
        this.charming = charming;
        this.harmfull = harmfull;
        this.footSize = footSize;
    }

    public Capucin(int charming) {
        this.charming = charming;
        this.footSize = 38;
        this.harmfull = 1;
    }

    public Capucin() {
    }

    protected void washFace() {
        System.out.println("Face cleaned");
    }

    private void washEars() {
        System.out.println("Ears washed");
    }

    public void eatBananas(int count) {
        System.out.println("Ate " + count + " bananas");
    }
}
