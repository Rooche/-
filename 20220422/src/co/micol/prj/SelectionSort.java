package co.micol.prj;
//메인프로젝트명, 서브프로젝트명, ????

public class SelectionSort {
	private int i;
	private int j;
	private int min;
	// 내부에서 쓸때는 get,set을 안만들어도 됨
	// 외부에서 쓸때는 만들것
	//논리 -> 알고리즘
	//순서도를 그려볼것 = 순차 비교 반복
	// 상속(extends)
	// 클래스를 만들때 public을 사용하면 외부에 보이지만
	// 나머지를 사용하면 정보가 은닉이됨

	public void sort(int[] arr) {
		// 초기데이터 출력
		arrPrint(arr);

		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) { // 요소 비교
				if (arr[min] < arr[j]) { // 내림차순
					// if (arr[min] > arr[j]) {
					min = j;

				}
			}
			
			if (min != i) { // swap(스왑)
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		resultprint(arr);
	}

	private void resultprint(int[] arr) {
		System.out.println("=== 결과 데이터 ===");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n=================");
	}

	private void arrPrint(int[] arr) {
		System.out.println("=== 초기 데이터 ===");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n=================");
	}

}
