
package model;

public class AircraftDB {

	public double[][] CrjSeatCoordinates() {

		// these coordinates work for the CRJ200
		double[][] seatCoordinates = { { -101.5, -115 }, { -84, -115 }, { -36, -115 }, { -18.5, -115 }, // row 1
				{ -101.5, -87.8 }, { -84, -87.8 }, { -36, -87.8 }, { -18.5, -87.8 }, // row 2
				{ -101.5, -60.6 }, { -84, -60.6 }, { -36, -60.6 }, { -18.5, -60.6 }, // row 3
				{ -101.5, -33.4 }, { -84, -33.4 }, { -36, -33.4 }, { -18.5, -33.4 }, // row 4
				{ -101.5, -6.2 }, { -84, -6.2 }, { -36, -6.2 }, { -18.5, -6.2 }, // row 5
				{ -101.5, 21 }, { -84, 21 }, { -36, 21 }, { -18.5, 21 }, // row 6
				{ -101.5, 48.2 }, { -84, 48.2 }, { -36, 48.2 }, { -18.5, 48.2 }, // row 7
				{ -101.5, 102 }, { -84, 102 }, { -36, 102 }, { -18.5, 102 }, // row 8
				{ -101.5, 129.2 }, { -84, 129.2 }, { -36, 129.2 }, { -18.5, 129.2 }, // row 9
				{ -101.5, 156.4 }, { -84, 156.4 }, { -36, 156.4 }, { -18.5, 156.4 }, // row 10
				{ -101.5, 183.6 }, { -84, 183.6 }, { -36, 183.6 }, { -18.5, 183.6 }, // row 11
				{ -101.5, 210.8 }, { -84, 210.8 }, { -36, 210.8 }, { -18.5, 210.8 }, // row 12
				{ -101.5, 238 }, { -84, 238 } }; // row 13

		return seatCoordinates;
	}

	public double[][] getErjSeatCoordinates() {

		// these coordinates work for the ERJ170
		double[][] ERJseatCoordinates = { { -101, -93 }, { -44, -93 }, { -18.5, -93 }, // row 1
				{ -101, -55 }, { -44, -55 }, { -18.5, -55 }, // row 2
				{ -101, -17.4 }, { -44, -17.4 }, { -18.5, -17.4 }, // row 3
				{ -101, 20 }, { -44, 20 }, { -18.5, 20 }, // row 4
				{ -102, 70 }, { -84, 70 }, { -36, 70 }, { -18.5, 70 }, // row 5
				{ -102, 96 }, { -84, 96 }, { -36, 96 }, { -18.5, 96 }, // row 6
				{ -102, 121 }, { -84, 121 }, { -36, 121 }, { -18.5, 121 }, // row 7
				{ -102, 146 }, { -84, 146 }, { -36, 146 }, { -18.5, 146 }, // row 8
				{ -102, 173 }, { -84, 173 }, { -36, 173 }, { -18.5, 173 }, // row 9
				{ -102, 198 }, { -84, 198 }, { -36, 198 }, { -18.5, 198 }, // row 10
				{ -102, 224 }, { -84, 224 }, { -36, 224 }, { -18.5, 224 }, // row 11
				{ -102, 248 }, { -84, 248 }, { -36, 248 }, { -18.5, 248 }, // row 12
				{ -102, 272 }, { -84, 272 }, { -36, 272 }, { -18.5, 272 }, // row 13
				{ -102, 299 }, { -84, 299 }, { -36, 299 }, { -18.5, 299 }, // row 14
				{ -102, 323 }, { -84, 323 }, { -36, 323 }, { -18.5, 323 }, // row 15
				{ -102, 348 }, { -84, 348 }, { -36, 348 }, { -18.5, 348 }, // row 16
				{ -102, 376 }, { -84, 376 }, { -36, 376 }, { -18.5, 376 }, // row 17
				{ -102, 400 }, { -84, 400 }, { -36, 400 }, { -18.5, 400 }, // row 18
				{ -102, 425 }, { -84, 425 }, { -36, 425 }, { -18.5, 425 }, // row 19
				{ -102, 450 }, { -84, 450 }, { -36, 450 }, { -18.5, 450 }, // row 20
		};

		return ERJseatCoordinates;
	}
}