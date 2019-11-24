package obiektowosc;

public class Car {
    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer wiek;
    private Integer predkosc;

    public Car (String marka, String model, Integer rok){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rok;
        this.wiek = this.obliczWiek();
        this.predkosc = 0;
    }

    private Integer obliczWiek(){
        Integer aktualnyRok = 2019;
        return aktualnyRok - rokProdukcji;
    }
    public void przyspiesz(Integer zmiana){
        this.predkosc += zmiana;
        System.out.println("Twoja aktualna prędkość to: " + this.predkosc);


    }
    public void opiszAuto(){
        System.out.println("Oto " + this.marka + " " + this.model);
        if (this.wiek < 5){
            System.out.println("Nowe auto prawie nie używane");
        }else if (this.wiek <=20){
            System.out.println("Troche już jeździ, ale wciąż działa");
        }else{
            System.out.println("Nadaje sie tylko na zlom");
        }
    }

}
