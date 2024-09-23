public class Main2 {
    public static void main(String[] args) {
        // 나: 3000원, 커피: 3000원
        // 커피 살 수 있으면 "커피 1잔", 못 사면 "외상 돼요?" 출력
        /*int me = 3000;
        int coffee = 3000;
        if(me >= coffee){
            System.out.println("커피 1잔");
        } else {
            System.out.println("외상 돼요?");
        }*/

        // while 사용
        // 1~100까지
        // 2의 배수는 1을 더해서 출력
        // 3의 배수는 1을 빼서 출력
        // 2와 3의 공배수는 2와 3의 공배수 (해당 숫자) 입니다 출력
        // 배수가 아니면 NO 출력
        // 0일 땐 0입니다 출력

        int i = 0;

        while (i <= 30) {
            boolean is2multi = i % 2 == 0;
            boolean is3multi = i % 3 == 0;
            boolean is6multi = is2multi && is3multi;
            boolean isZero = i == 0;
            if(isZero) System.out.println(i + " 입니다.");
            if (is6multi) System.out.println("2와 3의 공배수 " + i + " 입니다");
            else if(is2multi)System.out.println(i+1);
            else if (is3multi) System.out.println(i-1);
            else System.out.println("NO");
            i++;
        }

    }
}
