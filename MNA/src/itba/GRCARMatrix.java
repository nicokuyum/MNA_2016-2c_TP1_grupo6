package itba;


public class GRCARMatrix extends Matrix {

	public GRCARMatrix(int num, int l) {
		super(num,num);
		this.fill(l);
	}

	/**
	 * Completes the matrix according to GRCAR matrix definition
	 * @param l the max amount of 1's on each row
	 */
	private void fill(int l) {
		for (int i = 0; i < super.rows; i++) {
			for (int j = 0; j < super.cols; j++) {
				if (i == j || (j > i && j <= (i + l))) {
					matrix[i][j] = 1;
				} else if (i == (j + 1)) {
					matrix[i][j] = -1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
	}
	


}
