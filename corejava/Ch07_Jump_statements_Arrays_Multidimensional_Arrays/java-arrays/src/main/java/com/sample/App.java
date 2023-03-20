package com.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		twodimarray();
		multidimarray();
	}

	public static void twodimarray() {
		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void multidimarray() {
		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 2; k++) {

					System.out.print(arr[i][j][k] + " ");
				}

				System.out.println();
			}
			System.out.println();
		}
	}
}
