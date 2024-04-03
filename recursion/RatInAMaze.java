package recursion;

public class RatInAMaze {

	public RatInAMaze() {
		// TODO Auto-generated constructor stub
	}
	
	public void maze(int current_row, int current_col, int end_row, int end_col, String solution) {
		
		//positive base case - when rat reaches the last cell in the maze
		if(current_row == end_row && current_col == end_col) {
			System.out.println(solution);
			return;
		}
		
		//negative base case - to stop the rat from moving outside of the border
		if(current_row > end_row || current_col > end_col) {
			System.out.println(solution);
			return;
		}
		
		//2 recursive calls from each cell - down(horizontal) and right(vertical)
		maze(current_row, current_col+1, end_row, end_col, "H");
		maze(current_row+1, current_col, end_row, end_col, "V");
	}

	public static void main(String[] args) {
		int N = 0;
		
		RatInAMaze obj = new RatInAMaze();
		
		obj.maze(0, 0, 2, 2, "");

	}

}
