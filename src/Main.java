import Pair.Pair;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static String zwrocImie(Integer case1){
        //Integer case1 = 5;
        String imie = "";
        switch (case1){
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "NoName";
        }
        return imie;
    }
    public static void przedstawSie(String imie){
        System.out.println("Moje imie to " +imie);
    }

    public static void main(String[] args) {
        //String imie=zwrocImie( case1: 5);
        //przedstawSie(imie);
        //imie = zwrocImie(case1: 1);
        //przedstawSie(imie);
        //przedstawSie(zwrocImie(case1: 10));


        System.out.println("Czesc jak się masz");
        System.out.println("mam sie dobrze");
        //zmienne string zmienna tekstowa
        String napis1="Napis1";
        //zmienna logiczna - boolean
        Boolean isTomek = napis1.contains("Tomek");
        System.out.println(isTomek);
        //integer - typ numeryczny całkowity
        Integer liczba1=2;
        Long liczba2=Long.valueOf(1302);
        liczba1.equals(liczba2);
        //typ prosty
        int liczba3=5;
        //float - typ numeryczny zmiennoprzecinkowy
        //Float ulamek1=10.155;
        Double ulamek2=10.5;
        //Kolekcje
        //Lista=zbior elementów w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());
        ///HashMap - slownik trzymający pary kluczy-wartość
        HashMap<String, Integer> mapa1=new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        System.out.println(mapa1.toString());
        //Pair - slownik tylko jedną pare klucza wartosc
        //Pair<String, Integer> mojaPara = new Pair<> ("Asia",1);
        //String napis2 = mojaPara.getKey();
        //napis2 += mojaPara.getValue().toString();
        //System.out.println(napis2);
        //Pętla
        //Pętla for - warunek poczatkowy, warunek koncowy, modyfikator ( co jeden i++)
        for (Integer i=0; i<=10; i+=2) {
            System.out.println("wartosc licznika:" + i.toString());
        }
        Integer i=0;
        while(i<5){
            System.out.println("Jestem w while po raz " + i.toString());
            i++;
        }
        while(true){
            i++;
            if ((i.equals(7)))
                //continue pozwala przejsc do kolejnej iteracji
                continue;
            System.out.print(" " + i.toString());
            if (i.equals(10))
                break;
        }
        //Petla do while - zawsze wykona sie chociaz jedna iteracja
        do {
            System.out.println("Jestem w do while " + i.toString());
            i++;
        }while(i<10);
        //Petla for each na liscie
        for (String el: lista1) {
            System.out.println("Element listy: " + el);
        }
        //Petla for each na mapie #TODO
        //for (String el: mapa1)()

        //Instrukcje warunkowe
        //Instrukcje if...else if...else
        if (lista1.size() == 2){
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }
        if (lista1.size()<1){
            System.out.println("Z tym warunkiem nigdy nie wypisze");
        }else{
            System.out.println("Jestem w instrukcji else");
        }
        if (lista1.size()<1){
            System.out.println("Nie wykonam się");
        }else if (lista1.size()==2){
            System.out.println("Ja sie wykonam");
        }else{
            System.out.println("Ja się już nie wykonam, bo warunek jest spełniony");
        }
        //Instrukcje warunkowe switch case, po każdym case musi być break
        i=2;
        String message = "Moje imię to ";
        switch (i){
            case 2: message += "Asia";break;
            case 5: message += "Tomek";break;
            case 8: message += "Dawid";break;
        }
        System.out.println(message);
    }


}
