public class Main {
    public static void main(String[] args) {
        // luodaan uusi olio
        Kahvinkeitin mocca = new Kahvinkeitin();
        mocca.vari = "Pinkki";
        mocca.merkki = "MoccaMasteri";
        mocca.TulostaTiedot();

        // lisätään H2O
        mocca.LisaaVetta(1);

        // lisätään puruja
        mocca.LisaaPuruja(1);
    }
}// Main class end here

// Luokan luonti
class Kahvinkeitin {
    String vari;
    String merkki;
    int vesiMaara;
    int puruMaara;

    // Construction
    public Kahvinkeitin() {
        vari = "musta";
        merkki = "Electrolux";
        vesiMaara = 0;
    }

    // Toiminto
    public void PaallePois(boolean on) {
        if (on == true) {
            System.out.println("Kahvinkeitin on päällä.");
        }
        if (on == false) {
            System.out.println("Kahvnikeitin on sammuksi.");
        }
    }

    // Tietojen tulostaminen
    public void TulostaTiedot() {
        System.out.println("*** Kahvinkeittimen tiedot ***");
        System.out.println("Keittimen väri: " + vari);
        System.out.println("Keittimen merkki: " + merkki);
    }

    // Uusi toiminto veden lisäämiseksi
    public void LisaaVetta(int maara) {
        if (maara > 0) {
            vesiMaara += maara;
            System.out.println("Lisätty " + maara + " litraa vettä. Uusi vesimäärä: " + vesiMaara + " litraa.");
        } else {
            System.out.println("Virhe: Lisättävän veden määrän on oltava positiivinen.");
        }

    }

    // Uusi toiminto purujen lisäämiseksi
    public void LisaaPuruja(int maara2) {
        if (maara2 > 0) {
            puruMaara += maara2;
            System.out.println("Lisätty " + maara2 + " kupillista puruja. Uusi kuppimäärä: " + puruMaara + " kuppia.");
        } else {
            System.out.println("Virhe: Lisättävän purun määrän on oltava positiivinen.");
        }

    }
}
