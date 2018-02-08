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
    public static void main(String[]args){}
}
