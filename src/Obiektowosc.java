import dziedziczenie.Man;
import dziedziczenie.Woman;
import obiektowosc.Human;

public class Obiektowosc {
    public static void main(String[] args){


        Human czlowiek1 = new Human(  "Asia",  "Rybak",  1985);
        czlowiek1.przedstawSie();
        //Atrybut name oraz funkcja oblicz wiek nie sa dostepne poza klassa obiektowosc.Human
        //czlowiek1.name;
        //czlowiek1.obliczWiek();

        Human czlowiek2 = new Human("Robert", "Kowalski", 1991);
        czlowiek2.przedstawSie();

        Human czlowiek3 = new Human("Dawid", "Nowak", 1983);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + " " + czlowiek3.getSurname());
        czlowiek3.przedstawSie();

        //Obiekt klasy Woman dziedziczacej po Human
        Woman kobieta1 = new Woman("Kasia", "Kowalska", 2007);
        kobieta1.przedstawSie();
        kobieta1.setBirthYear(2009);
        kobieta1.getName();

        Man mezczyzna1 = new Man("Tomek", "Górny", 1998);
        mezczyzna1.setWaga(70);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();
    }
}
