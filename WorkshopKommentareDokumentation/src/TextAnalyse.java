import java.util.Map;
import java.util.HashMap;


public class TextAnalyse {

    // Zählt die Anzahl der Wörter in einem Text
    public int zaehleWoerter(String text) {
        if (text == null || text.isEmpty()) // Prüfen auf leeren oder null Text
            return 0;
        String[] woerter = text.split("\\s+"); // Aufteilen des Textes in Wörter
        return woerter.length; // Rückgabe der Anzahl der Wörter
    }

    // Findet das längste Wort im Text
    public String findeLaengstesWort(String text) {
        if (text == null || text.isEmpty())
            return "";
        String[] woerter = text.split("\\s+");
        String laengstes = "";
        for (String wort : woerter) {
            if (wort.length() > laengstes.length())
                laengstes = wort;
        }
        return laengstes; // Längstes Wort im Text
    }

    // Berechnet die Häufigkeit jedes Zeichens im Text
    public Map<Character, Integer> zeichenHaeufigkeit(String text) {
        Map<Character, Integer> haeufigkeit = new HashMap<>();
        for (char c : text.toCharArray()) {
            haeufigkeit.put(c, haeufigkeit.getOrDefault(c, 0) + 1); // Zähle Zeichen
        }
        return haeufigkeit; // Rückgabe der Häufigkeitsmap
    }

    // Hauptmethode zum Testen
    public static void main(String[] args) {
        TextAnalyse analyse = new TextAnalyse();
        String text = "Das ist ein Beispieltext für die Textanalyse.";

        // Testen der Methoden
        System.out.println("Anzahl der Wörter: " + analyse.zaehleWoerter(text));
        System.out.println("Längstes Wort: " + analyse.findeLaengstesWort(text));
        System.out.println("Zeichenhäufigkeit: " + analyse.zeichenHaeufigkeit(text));
    }
}