package jeondabeen.report3;

public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        //예상 결과 : sum=15
        System.out.println("sum=" + sum);
    }
}
