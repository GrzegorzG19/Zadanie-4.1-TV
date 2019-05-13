public class Main {
    public static void main(String[] args) {

        Televisor tv = new Televisor();
        tv.showTv(); //sprawdzenie czy tv jest włączony
        tv.turnOn(); //włączenie tv
        tv.showTv(); //pokazanie że tv jest włączony
        tv.turnOff(); //wyłączenie tv
        tv.showTv(); //pokazanie że tv jest wyłączony
    }
}