public class Main {
    public static void main(String[] args) {

        // 아아 3000원
        // 시간 당 아아 4잔 팔아
        // 알바 1명 사용
        // 알바 시급 10030
        // 알바 5시간 사용
        // 운영 8시간
        // 한 달(30일) 운영 시, 총 순수익

        int iceAme = 3000;
        int cupPer1 = 4;
        int alba = 10030;
        int openTime = 8;
        int partTime = 5;
        int mon = 30;

        System.out.println((((iceAme* cupPer1)*openTime) - (alba* partTime))*mon);
    }
}