import java.util.Arrays;
public class Boutique {
    private static int n = 0;
    private Vestito []capo;
    private String nome;
    private Scarpe []scarpa;
    private Occhiali []occhiale;

    public Boutique(Vestito []capo, String nome, Scarpe []scarpa, Occhiali []occhiale) {
        this.capo = capo;
        this.nome = nome;
        this.scarpa = scarpa;
        this.occhiale = occhiale;
        n++;
    }

    public Vestito getCapo(int x) {
        return capo[x];
    }

    public String getNome() {
        return nome;
    }

    public Scarpe getScarpa(int x) {
        return scarpa[x];
    }
    public Occhiali getOcchiale(int x) {
        return occhiale[x];
    }

    public static int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "Boutique{" +
                "capi=" + Arrays.toString(capo) +
                ", nome negozio='" + nome + '\'' +
                ", scarpe=" + Arrays.toString(scarpa) +
                ", occhiali=" + Arrays.toString(occhiale) +
                '}';
    }
}
