package com.xworkz.aptitude;

public class Matrix2 {

	public static void main(String[] args) {
		
			// args[0]="C";
			Matrix1 mat = new Matrix1();
			// Integer ref = Integer.parseInt();

			mat.primaryDiagona();
		}

		public void secondaryDiagonal() {

			for (int row = 1; row <= 5; row++) {

				System.out.print("\n");

				for (int col = 1; col <= 5; col++) {
					if (row == 1) {
						System.out.print(col + "" + row + "\t");

					}

				}

			}
		}



	}


