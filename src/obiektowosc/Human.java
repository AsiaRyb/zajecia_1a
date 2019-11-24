package obiektowosc;

public class Human {
    //atrybuty klasy
    private String name;
    private String surname;
    private Integer birthYear;
    private Integer age;

    //konstruktor
    // slowko "this" do tego modelu przydziel dane
    public Human(String name, String surname, Integer birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }
    //Słówko static - pozwala dostac sie do tej funkcji bez inicjolizacji obiektu
    //niemozemy operowac w niej na zadanych atrybutach/metodach niestatycznych
    public static void opiszKlase(){
        System.out.println("Klasa human oblicza wiek i umożliwia przedstwaienie sie obiektu");
    }
    //metody klasy
    private Integer obliczWiek(){
        Integer actualYear = 2019;
        return actualYear - this.birthYear;
    }
    //public void uzywa sie gdy chce sie np. cos wyswietlic
    public void przedstawSie(){
        System.out.println("Hej nazywam się " + this.name + " " + this.surname);
        System.out.println("Mam " + this.age + " lat.");
    }

    // Metody settery i gettery
    //Getter do pobierania danych

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Setter zawsze jest voidem on nic nie zwraca, ustawia się dane
    public void setBirthYear(Integer birthYear){
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }
}
