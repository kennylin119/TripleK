public class QuickSortTester{

    public static int[] buildArray( int s) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = i;
	return retArr;
    }
	
	//tests worst case scenario
	//checks the left most index each time
    public static void collectDataW() {
	for (int n = 1000; n <= 15000; n+= 100) {
	    long avg = 0;
	    for (int x = 0; x < 10; x++) {
		int temp[] = buildArray(n);
		long nano = System.nanoTime();			
		QuickSort.qsort(temp);
		long diff = System.nanoTime() - nano;
		avg += diff;
	    }
	    avg /= 10;
	    System.out.println(n + "," + avg);
	}
    }

	//tests best case scenario
	//checks the left most index each time
    public static void collectDataB() {
	for (int n = 1000; n <= 15000; n+= 100) {
	    long avg = 0;
	    for (int x = 0; x < 10; x++) {
		int temp[] = buildArray(n);
		long nano = System.nanoTime();			
		QuickSort.qsortMed(temp);
		long diff = System.nanoTime() - nano;
		avg += diff;
	    }
	    avg /= 10;
	    System.out.println(n + "," + avg);
	}
    }	
	
    public static void main(String[]args){
	System.out.println("array size(n), time(nanoseconds)");
	//collectDataW();
	collectDataB();	
    }
}
