package weekEight;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] A = {3, 1, 4, 5, 2};

        for (int i = 1; i < A.length; i++) {
            int key = A[i]; //key는 현재 비교할 요소의 값을 저장하는 역할
            int j = i - 1; //j는 현재 비교할 요소의 이전 인덱스

            while (j >= 0 && A[j] > key) { //첫 번째 조건 j는 0번 인덱스 이상 두 번째 조건은 현재 요소랑 이전 요소 비교조건
                A[j + 1] = A[j]; // 만약 현재 요소가 이전 요소보다 크다면 이전 요소를 오른쪽으로 한 칸 이동
                j--; // j를 1씩 줄여가며 이전 요소들도 비교
            }

            A[j + 1] = key; //while문 충족 못하면 여기로 바로옴 임시 위치 지정됨 현재 요소 값을 j인덱스에 1더한 자리 요소
        }

        for (int i : A) { // 포이치 반복문을 사용하여 배열 A의 모든 요소를 가져와서 변수 i에 할당
            System.out.println(i); //변수 i에 할당된 값을 한 줄씩 출력
        }
    }
}
