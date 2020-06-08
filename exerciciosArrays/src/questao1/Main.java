package questao1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] m1 = {{5,4}, {0,2}, {1,-1}};
		int[][] m2 = {{0,-2}, {5,-3}, {-1,0}};
		System.out.println(Arrays.deepToString(ArrayMathUtils.somaMatrizes(m1, m2)));

		
	}

}
