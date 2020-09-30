public class Main {
    public static void main(String[] argv){
        System.out.println("Fraction :");
        Fraction f = new Fraction(2,5);
        System.out.println(f.toString());
        assert f.toString().equals("2 / 5") : "Erreur d'affichage";
    }
}
