/* Kenny Li
APCS2 pd 1
HW18 --  So So Quick
2018-03-13 */
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
	1. Partition the value at index 0.
	2. Using a two recursive call, set the left and right parameters
	   to be the section to the left of the pivot and to the right
	   of the pivot.
	3. This continues to happen until it reaches an array of size 1.
	   This means that the array is finished sorting.
 *
 * 2a. Worst pivot choice and associated runtime: O(n^2) My code checks the element at index 0
	   so the worst case would be making the pivot value one of the extremes. 
	   [12, 1, 3, 7 ,5] or [1,5,12,3,7] are some examples of worst case because the extremes are
	   at element 0.
 *
 * 2b. Best pivot choice and associated runtime: 0(nlogn) If the element at index 0 is the middle
	   element in the sorted array. This results in the array being split into 2 equal halves which
	   is similar to the mergesort that we did.
 *
 * 3. Approach to handling duplicate values in array:
 *	  I didn't manage to encounter anything wrong with my code while handling duplicates so I
	  left it as is. I'm not too sure where the problem arises.
 *****************************************************/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a ) {
    for ( int o : a )
	    System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ) {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ) {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------

  public static int partition( int[] arr, int left, int right, int pvtPos)
  {
    int pvtVal = arr[pvtPos];

    swap( pvtPos, right, arr);
    int storPos = left;

    for( int i = left; i < right; i++ ) {
	    if ( arr[i] < pvtVal) {
        swap( i, storPos, arr );
        storPos++;}
    }
    swap(storPos, right, arr);

    return storPos;
  }//end partition
  /*****************************************************
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   *****************************************************/
  public static void qsort( int[] d )
  { 
	qsort(d, 0, d.length - 1, d.length - 1);
  }
  
  public static void qsortMed( int[] d )
  { 
	qsortMed(d, 0, d.length - 1, (d.length - 1) / 2);
  }  

  public static void qsortMed( int[] d, int left, int right, int n)
  { 
	if (left < right) {
		int pvtPos = partition(d, left, right, n);
		qsortMed(d, left, pvtPos - 1, (pvtPos - 1) / 2);
		qsortMed(d, pvtPos + 1, right, (right + pvtPos + 1) / 2);
	}
  }
  
  public static void qsort( int[] d, int left, int right, int n)
  { 
	if (left < right) {
		int pvtPos = partition(d, left, right, n);
		qsort(d, left, pvtPos - 1, pvtPos - 1);
		qsort(d, pvtPos + 1, right, pvtPos + 1);
	}
  }  

  //main method for testing
  public static void main( String[] args )
  {

    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 	
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );	
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
       
    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );	
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
       
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
	
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
