public class Fraction {
    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    @Override
    public String toString() {
        return numerateur + " / " + denominateur;
    }
}
