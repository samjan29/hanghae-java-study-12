package jeondabeen.report7;

public class Report7_5 {
    static int abs(int value) {
        if (value < 0) value *= -1;

        return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
    //예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
}
