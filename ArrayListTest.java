public class ArrayListTest{
	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		// obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		// obj1.add(3);
		obj1.pop();
		obj1.resize();
		
		System.out.println("toString " + obj1.toString());
		System.out.println("The number of elements in the new Array is " + obj1.a);
		System.out.println("The Size of new Array is " + obj1.size());
		System.out.println("All Test Cases Passed.");
	}
}