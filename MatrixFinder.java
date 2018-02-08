/* 
   Team Triple K (Kenny Lin, Kenny Li, Kendrick Liang)
   APCS pd 1
   HW03 --  I Am Still Searching
   2018-02-01
*/
/*
  Searches the element i in int[][] m. If the 
  element is found, then returns its position.
  If i is greater than element at coordinate,
  moves down one row. If i is less than element
  at coordinate, move left. If not found and can't
  move either left or right, returns "(-1, -1)"
*/
public class MatrixFinder{
    public static String search(int[][] m, int i){
	int x = 0;
	int y = m.length - 1;
	while (x < m.length && y >= 0){
	    if (m[x][y] == i)
		return "(" + x + ", " + y + ")";
	    if (m[x][y] > i)
		y--;
	    else
		x++;
	}
	return "(-1, -1)";
    }
    public static void main(String [] args){
	int[][] mat = { {1, 2, 3, 4},
			{2, 3, 4, 5},
			{3, 4, 5, 6},
			{7, 8, 9, 10} };
	System.out.println(search(mat, 7));
	System.out.println(search(mat, 4));
	System.out.println(search(mat, 11));
	int[][] pat = {{5}};
	System.out.println(search(pat, 5));
	System.out.println(search(pat, 6));
    }
}
