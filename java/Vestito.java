public class Vestito {
    private String nome;
    private double prezzo;
    private String stylist;
    //costruttore
    public Vestito(String nome,double prezzo,String stylist){
        this.nome=nome;
        if(this.nome.isEmpty()||this.nome==null){this.nome="capo sconosciuto";}
        this.prezzo=prezzo;
        this.stylist=stylist;
        if(this.stylist.isEmpty()||this.stylist==null){this.stylist="capo sconosciuto";}
    }
//nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
//prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
//stylist
    public String getStylist() {
        return stylist;
    }

    public void setStylist(String stylist) {
        this.stylist = stylist;
    }

    @Override
    public String toString() {
        return "Vestito{" +
                "nome capo'" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", Stylist/Maison='" + stylist + '\'' +
                '}';
    }
}
