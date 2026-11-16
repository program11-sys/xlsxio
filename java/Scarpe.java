public class Scarpe {
    public void setStylist(String stylist) {
        this.stylist = stylist;
    }

    private String nome;
    private double prezzo;
    private String stylist;
    //costruttore
    public Scarpe(String nome,double prezzo,String stylist){
        this.nome=nome;
        if(this.nome.isEmpty()||this.nome==null){this.nome="scarpa sconosciuto";}
        this.prezzo=prezzo;
        this.stylist=stylist;
        if(this.stylist.isEmpty()||this.stylist==null){this.stylist="stylist sconosciuto";}
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

    @Override
    public String toString() {
        return "Scarpa{" +
                "nome scarpa'" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", Stylist/Maison='" + stylist + '\'' +
                '}';
    }
}