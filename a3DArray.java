import java.lang.*;
class a3DArray {
	public static void main (String args[]) {
		int my3DArray [][][] = new int [5][5][5];
		int i,j,k;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				for(k=0;k<5;k++){
					my3DArray[i][j][k]=i*j*k;
				}
			}
		}
		
				for(i=0;i<5;i++){
					for(j=0;j<5;j++){
						for(k=0;k<5;k++)
							System.out.print(my3DArray[i][j][k] + "\t");
						System.out.println();
					}
					System.out.println();
				}
	}
}