package Q3;
class Generic<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class Genericarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5};
		Generic<Integer> objGeneric = new Generic<>();
		Integer[] arr1=objGeneric.swap(arr, 0, 3);
		for(int i : arr1) {
			System.out.println(i);
	}

}
}
