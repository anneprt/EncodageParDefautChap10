import java.io.UnsupportedEncodingException;

public class EncodageParDefaut {
    public static void main(String[] args) {
        String encodage = System.getProperty("file.encoding");
        System.out.println("Encodage par défaut : " + encodage);

        String proverbe = "Qui s\u00E8me le vent, r\u00E9colte la temp\u00EAte";
        try {
            String proverbeEncode = new String(proverbe.getBytes(), encodage);
            System.out.println("Proverbe : " + proverbeEncode);
        } catch (UnsupportedEncodingException e) {
            System.out.println("L'encodage " + encodage + " n'est pas supporté par l'interpréteur Java");
        }
    }
}
