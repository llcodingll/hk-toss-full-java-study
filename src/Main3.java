import java.util.Arrays;

// 자바의 시작 : 참조형
public class Main3 {
    public static void main(String[] args) {
//        String x = "안녕하세요";
//        System.out.println(x);

        // 1번째
//        String x = "안녕하세요";
//        for(int i = 0; i < 1_000_000; i++) {
//            System.out.println(x);
//        }

        // 2번째
        // 느려요: 왜 느린가요?
        // 1번째는 출력만 하지만 2번째는 새로운 객체를 계속 생성하고 할당하는 과정을 거치게 됨
        // 메모리: 1번째는 미리 메모리 할당 후 출력
        // 2번째는 계속 새로운 메모리에 할당
//        String y = "";
//        for(int i = 0; i < 1_000_000; i++) {
//            y+=x;
//        }
//        System.out.println(y);


        int coffee1 = 3000;
        int coffee2 = 2000;
        int coffee3 = 7000;
        // 변수 선언 방법
        int[] coffees = {3000, 2000, 7000};
        int first = coffees[0];
        System.out.println(first);

        // 6000, 7000, 8000
        int myCoffee1 = 6000;
        int myCoffee2 = 7000;
        int myCoffee3 = 8000;

        int[] myCoffees = {6000, 7000, 8000};
        int myFirst = myCoffees[0];
        System.out.println(myFirst);
        System.out.println(myCoffees.length);

        for (int myCoffee : myCoffees) {
            System.out.println(myCoffee);
        }

        /*for (int i = 0; i < myCoffees.length; i++) {
            System.out.println(myCoffees[i]+"원");
        }*/

        //array 선언 방법
        // 1. 타입[] 변수명 = {값,값,값};
        // 2. 타입[] 변수명 = new 타입[길이];
        /*int[] cpCoffees = {100, 200, 300};
        int[] cpCoffees2 = new int[3];
        cpCoffees2[0] = 100;
        cpCoffees2[1] = 200;
        cpCoffees2[2] = 300;*/
        // cpCoffees2도 0 = 100, 1 = 200, 3 = 300
        // 둘이 같은 지 비교
        // 둘이 값이 같으면 true 라고 나오게 하라
        /*System.out.println(Arrays.equals(cpCoffees, cpCoffees2));

        for (int i = 0; i < cpCoffees.length; i++) cpCoffees2[i] = cpCoffees[i] + cpCoffees2[i];
        System.out.println(cpCoffees == cpCoffees2);

        boolean isEqual = false;
        for (int i = 0; i < cpCoffees.length; i++) {
            isEqual = cpCoffees2[i] == cpCoffees[i];
            if (!isEqual) break;
        }
        System.out.println(isEqual);*/

        int[] cpCoffees = {100, 200, 300};
        int[] cpCoffees2 = new int[3];
        int[][] cp = new int[3][3];
        int[][] cp2 =
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        // 1,2,3
        // 4,5,6
        // 7,8,9
        for(int i = 0; i<cp2.length; i++){
            for(int j = 0; j<cp2[i].length; j++) {
                System.out.print(cp2[i][j]);
            }
            System.out.println();
        }

        int[][] cp22 = new int[3][3];
        System.out.println("-");
        // 9 8 7
        // 6 5 4
        // 3 2 1
        for (int i = 0; i<cp2.length; i++){
            for(int j = 0; j<cp2[i].length; j++){
                cp22[i][j] = cp2[2-i][2-j];
            }
        }
        for (int i = 0; i <cp2.length; i++) {
            for(int j = 0; j<cp2[i].length; j++){
                System.out.print(cp22[i][j]);
            }
            System.out.println();
        }
        System.out.println("-");
        // 1 4 7
        // 2 5 8
        // 3 6 9
        for(int i=0;i<cp2.length;i++){
            for(int j=0;j<cp2[i].length;j++){
                cp22[i][j]=cp2[j][i];
            }
        }
        for(int i=0;i<cp22.length;i++){
            for(int j=0;j<cp22[i].length;j++){
                System.out.print(cp22[i][j]);
            }
            System.out.println();
        }
        System.out.println("-");

        // 5 6 4
        // 8 9 7
        // 2 3 1
        for(int i=0;i<cp2.length;i++){
            for(int j=0;j<cp2[i].length;j++){
                cp22[i][j]=cp2[(i+1)%3][(j+1)%3];
            }
        }
        for(int i=0;i<cp22.length;i++){
            for(int j=0;j<cp22[i].length;j++){
                System.out.print(cp22[i][j]);
            }
            System.out.println();
        }

        System.out.println("-");
        // 6 4 5
        // 9 7 8
        // 3 1 2
        for(int i=0;i<cp2.length;i++){
            for(int j=0;j<cp2[i].length;j++){
                cp22[i][j]=cp2[(i+1)%3][(j+2)%3];
            }
        }
        for(int i=0;i<cp22.length;i++){
            for(int j=0;j<cp22[i].length;j++){
                System.out.print(cp22[i][j]);
            }
            System.out.println();
        }
    }
}
