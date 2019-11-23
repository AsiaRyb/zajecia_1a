import java.util.ArrayList;
import java.util.HashMap; //ALT+Enter automatycznie importuje klase
import java.util.List;

public class Main2 {
    public static Double cenaBrutto(Double cena){
        return cena*1.23;
    }
    public static void main(String[] args){
        HashMap<String, Double> owoce=new HashMap<>();
        owoce.put("Banan", 12.5);
        owoce.put("Cytryna", 10.5);
        owoce.put("Ananas", 9.5);
        List <String> nazwyOwocow = new ArrayList<>();
        nazwyOwocow.add("Banan");
        nazwyOwocow.add("Cytryna");
        nazwyOwocow.add("Ananas");

        Double cenaSumaryczna=0.0;
        for(Integer i=0; i<owoce.size(); i++){
            String owoc = nazwyOwocow.get(i);
            cenaSumaryczna += cenaBrutto(owoce.get(owoc));
            System.out.println(owoc);
            System.out.println(cenaBrutto(owoce.get(owoc)));

        }
        System.out.println("Cena twoich zakupów to: " +cenaSumaryczna.toString());
    }
}
