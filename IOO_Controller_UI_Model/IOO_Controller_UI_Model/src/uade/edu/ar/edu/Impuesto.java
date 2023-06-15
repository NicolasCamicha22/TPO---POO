package uade.edu.ar.edu;

public enum Impuesto {

    IVA(0.21f),
    GANANCIA(0.35f);

    private final float percentage;

    private Impuesto(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }
}
