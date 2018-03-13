public class QuickSortTester{

    public static int[] buildArray( int s) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = i;
	return retArr;
    }

    public static void collectData() {
	for (int n = 1000; n <= 10000; n+= 100) {
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
    public static void main(String[]args){
	System.out.println("array size(n), time(nanoseconds)");
	collectData();
    }
}
