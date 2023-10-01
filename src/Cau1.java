public class Cau1 {
    //Đếm, in số lượng các nguyên âm và in ra số lượng chi tiết theo từng nguyên âm (nguyên âm bao gồm: u e o a i)
    //“Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do.”
    public static void main(String[] args) {
        String sentence = "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do.";

        int totalvowels = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (char ch : sentence.toCharArray()) {
            switch (ch) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }
        int sum = countA + countE + countI + countO +countU;
        System.out.println("Tổng số lượng nguyên âm là: " + sum);
        System.out.println("Trong đó:");
        System.out.println("Số lượng nguyên âm 'a': " + countA);
        System.out.println("Số lượng nguyên âm 'e': " + countE);
        System.out.println("Số lượng nguyên âm 'i': " + countI);
        System.out.println("Số lượng nguyên âm 'o': " + countO);
        System.out.println("Số lượng nguyên âm 'u': " + countU);
    }
}
