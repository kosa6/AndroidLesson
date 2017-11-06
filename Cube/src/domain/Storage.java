package domain;

import java.util.ArrayList;

public class Storage {
	static final int x=6,y=6,z=6;
	ArrayList<Package[][]> cubePositionY = new ArrayList<Package[][]>();
	
	private void addElementsToStorage() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					cubePositionY.add(new Package[j][k]);
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
