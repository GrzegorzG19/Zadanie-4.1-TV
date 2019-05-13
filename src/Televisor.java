public class Televisor {
    boolean turn = false;

    boolean turnOn() {

        return turn = true;
    }

    boolean turnOff() {

        return turn = false;
    }

    void showTv() {
        System.out.printf("Is tv turned on? \n -%b \n", turn);
    }
}
