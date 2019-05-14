public class Televisor {
    boolean turn = false;

    void turnOn() {
    turn = true;

    }

    void turnOff() {
        turn = false;

    }

    void showTv() {
        System.out.printf("Is tv turned on? \n -%b \n", turn);
    }
}
