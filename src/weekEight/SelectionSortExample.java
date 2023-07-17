package weekEight;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] A = {13, 99, 50, 71, 2, 7, 41, 62, 77, 85};
        boolean Re = false;

        for (int i = 0; i < A.length - 1; i++) {
            Re = true; //위치변경이 없을 경우 true값이 적용 반복문 종료
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    Re = false;
                }
            }
            if (Re) {
                break;
            }
        }

        System.out.println();
        for (int i : A) {
            System.out.println(i);
        }
    }
}