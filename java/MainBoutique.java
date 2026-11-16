import java.util.Scanner;
public class MainBoutique {
    public static void main (String [] args){
        Scanner scanner=new Scanner("System.in");
        final int dim=5;
        Vestito []v=new Vestito[dim];
        Scarpe []s=new Scarpe[dim];
        Occhiali [] o=new Occhiali[dim];
        System.out.println("Benvenuto nel magazzino, scrivimi le scorte a disposizione");
        boolean var=true;
        Integer x= null;
        int vi=0;
        int si=0;
        int oi=0;
        do {
            if(x!=null && (x>3 ||x<1)){System.out.println("ERRORE!\tImmettere un valore compreso tra 1 e 3");}
            System.out.println("cosa vuoi immettere?\n1-Vestito\n2-Scarpe\n3-Ochhiali");
            x=scanner.nextInt();
            switch (x){
                case 1:{if(vi+1<=dim){
                        System.out.println("nome capo:");
                        String nome,stylist;double prezzo;
                        nome=scanner.nextLine();
                        System.out.println("prezzo capo:");
                        prezzo=scanner.nextDouble();
                        System.out.println("Stylist/Maison:");
                        stylist=scanner.nextLine();
                        v[vi].setNome(nome);
                        v[vi].setPrezzo(prezzo);
                        v[vi].setStylist(stylist);}else
                        {System.out.println("Hai raggiunto il limite di "+dim+" capi");}
                        break;
                }
                case 2:{if(si+1<=dim){
                    System.out.println("nome scarpa:");
                    String nome,stylist;double prezzo;
                    nome=scanner.nextLine();
                    System.out.println("prezzo scarpa:");
                    prezzo=scanner.nextDouble();
                    System.out.println("Stylist/Maison:");
                    stylist=scanner.nextLine();
                    s[si].setNome(nome);
                    s[si].setPrezzo(prezzo);
                    s[si].setStylist(stylist);}else{
                    System.out.println("Hai raggiunto il limite di "+dim+" scarpe");
                }
                break;
                } case 3:{if(oi+1<=dim){
                    System.out.println("nome occhiale:");
                    String nome,stylist;double prezzo;
                    nome=scanner.nextLine();
                    System.out.println("prezzo occhiale:");
                    prezzo=scanner.nextDouble();
                    System.out.println("Stylist/Maison:");
                    stylist=scanner.nextLine();
                    o[oi].setNome(nome);
                    o[oi].setPrezzo(prezzo);
                    o[oi].setStylist(stylist);}else{
                    System.out.println("Hai raggiunto il limite di "+dim+" occhiali");
                }
                    break;

                }
            }
            if(oi!=dim && si!=dim &&vi!=dim){
                System.out.println("if you want to input more wrtite 'true' if not write 'false'");
                var=scanner.nextBoolean();
            }else{
                System.out.println("Strorage is full");
                var=false;
            }
        }while (var);
        String nome;
        System.out.println("Scrivi il nome della Boutique");
        nome= scanner.nextLine();
        System.out.println("Buongiorno,benvenuto da "+nome);
        Boutique b=new Boutique(v,nome,s,o);
    }


    }
