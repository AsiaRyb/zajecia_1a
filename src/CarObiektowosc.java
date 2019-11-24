import obiektowosc.Car;

public class CarObiektowosc {
    public static void main (String[] args){
            Car opel = new Car("Opel", "Astra", 2006);
            opel.przyspiesz (60);
            opel.przyspiesz( 20);
            opel.opiszAuto();

            Car audi = new Car( "Audi", "A7", 2016);
            audi.przyspiesz (170);
            audi.opiszAuto();
    }
}
