package compare;

/**
 * 每次从数组中取出两个较小的元素
 * 
 * @author xiangyajun
 *
 */
public class GetTwoLittItem {
	public static int[] getTwoLittItem(int[] arr, int maxValue) {
		int temp = 0;
		for (int j = 0; j < arr.length/2; j++) {
			int a = maxValue, b = maxValue;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != -1 && arr[i] < a) {
					a = arr[i];
				} else if (arr[i] != -1 && arr[i] < b) {
					b = arr[i];
				}
				if (a > b) {
					temp = a;
					a = b;
					b = temp;
				}
			}
			arr[a] = -1;
			arr[b] = -1;
			System.out.println(a + ", " + b);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println(getTwoLittItem(arr, 8));
	}
}
