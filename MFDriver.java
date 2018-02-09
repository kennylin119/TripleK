public class MFDriver{
    public static void populate(int[][] m){
	int i = 0;
	for (int x = 0; x < m.length; x++){
	    for (int y = 0; y < m.length; y++){
		m[x][y] = i;
		i++;
	    }
	}
	}
	
	public static void collectData() {
		for (int n = 1000; n <= 10000; n+= 100) {
			long avg = 0;
			for (int x = 0; x < 10; x++) {
				int[][] temp = new int[n][n];
				populate(temp);
				long nano = System.nanoTime();			
				MatrixFinder.search(temp, temp[n - 1][0]);
				long diff = System.nanoTime() - nano;
				avg += diff;
			}
			avg /= 10;
			System.out.println(n + "," + avg);
		}
    }
	
    public static void main(String[]args){
		System.out.println("matrix size(n), time(nanoseconds)");
		collectData();
	}
}
