

//Program to demonstrate on label forloop
package org.tnsif.looping;

public class LabelledForLoop {

	public static void main(String[] args) {
	
		//label
		outer:
			for(int i=1;i<=5;i++) {
				System.out.println();
				//label
				inner:
					for(int j=1;j<=5;j++) {
						System.out.print(j + " ");
						
						if(j==4)
							break;
						
						//if use continue it will skip that part
//						if(j==4)
//							continue;
//						System.out.print(j + " ");
						
					}
			}

	}

}