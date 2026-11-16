
public class Menu {

    // MENU PRINCIPALE
    private static String setMenu() {
        String s;
        s = "================================\n"
                + "Cosa vuoi gestire?:\n"
                + "1 - Vestiti\n"
                + "2 - Scarpe\n"
                + "3 - Occhiali\n"
                + "0 - Esci\n";
        return s;
    }

    public static String getMenu() {
        return setMenu();
    }

    // MENU VESTITI
    private static String setMenuves() {
        String s;
        s = "================================\n"
                + "       BOUTIQUE FASHION\n"
                + "================================\n"
                + "\n"
                + "1. Aggiungi un vestito\n"
                + "2. Elimina un vestito\n"
                + "3. Modifica un vestito\n"
                + "4. Visualizza catalogo\n"
                + "5. Ordina vestiti\n"
                + "0. Torna al menu principale\n"
                + "\n"
                + "Inserisci la tua scelta:";
        return s;
    }

    public static String getMenuves() {
        return setMenuves();
    }

    // MENU SCARPE
    private static String setMenuscarpe() {
        String s;
        s = "================================\n"
                + "       BOUTIQUE FASHION\n"
                + "================================\n"
                + "\n"
                + "1. Aggiungi una scarpa\n"
                + "2. Elimina una scarpa\n"
                + "3. Modifica una scarpa\n"
                + "4. Visualizza catalogo\n"
                + "5. Ordina scarpe\n"
                + "0. Torna al menu principale\n"
                + "\n"
                + "Inserisci la tua scelta:";
        return s;
    }

    public static String getMenuscarpe() {
        return setMenuscarpe();
    }

    // MENU OCCHIALI
    private static String setMenuocchiali() {
        String s;
        s = "================================\n"
                + "       BOUTIQUE FASHION\n"
                + "================================\n"
                + "\n"
                + "1. Aggiungi un occhiale\n"
                + "2. Elimina un occhiale\n"
                + "3. Modifica un occhiale\n"
                + "4. Visualizza catalogo\n"
                + "5. Ordina occhiali\n"
                + "0. Torna al menu principale\n"
                + "\n"
                + "Inserisci la tua scelta:";
        return s;
    }

    public static String getMenuocchiali() {
        return setMenuocchiali();
    }

    // MENU ORDINAMENTO VESTITI
    private static String setordmenu() {
        String s;
        s = "\n===== ORDINA VESTITI =====\n"
                + "1. Ordina per stylist\n"
                + "2. Ordina per prezzo\n"
                + "3. Ordina per nome\n"
                + "0. Torna al menu principale\n"
                + "Scelta: ";
        return s;
    }

    public static String getordmenu() {
        return setordmenu();
    }

}
