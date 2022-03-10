package arrays;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 20, 10 };

		int finalArray[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int value = a[i];

			boolean isValueAppearInFinalArray = false;
			for (int k = 0; k < finalArray.length; k++) {
				if (a[k] == value) {
					isValueAppearInFinalArray = true;
					break;
				}
			}
			if (!isValueAppearInFinalArray) {
				finalArray[j++] = value;
			}
		}

		for(int i=0; i< finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}
	}

}
