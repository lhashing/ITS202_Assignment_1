public class ArrayList {
	double one_forth;
	double three_forth;
	int max;
	int remove;
	int top;
	static double length;
	static int a;
	static int arr[];

	public ArrayList() {
		one_forth = 0.25;
		three_forth = 0.75;
		max = 4;
		top = 0;
		arr = new int[max];
	}

	public void add(int e) {
		arr[top] = e;
		top = top + 1;
	}

	public void pop() {
		top = top - 1;
		remove = arr[top];
		arr[top] = 0;
		int count = 0;

		for(int i = 0; i < arr[i]; i++) {
			count = count + 1;
		}

		a = count;
		length = (double)a / max;
		System.out.println("Remove Element " + remove);
	}
	
	public void resize() {
		if(length == one_forth ) {
			int newArr[] = new int[(max / 2) * 2];

			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}

			arr = newArr;
			max = max / 2;

			for(int n : newArr) {
				System.out.print(n + " ");
			}	
		}
		else if(length == three_forth) {
			int newArr[] = new int[max * 2];

			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}

			max = max * 2;
			arr = newArr;

			for(int j : newArr) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		else {
			System.out.println("Error: ArrayIndexOutOfBoundRange.");
		}
	}

	public int size() {
		return max;
	}

	public String toString() {
		String string = Integer.toString(max);
		return string;
	}

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
	}
}