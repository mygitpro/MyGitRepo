/**
 * 
 */
package mygitproject;
//This is my git project
//Test Commit To Private Repo
/**
 * @author yt53
 *
 */
public class Pyramid {

	/***
	 * @param args
	 ***/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<= 5 ;i++){
            
            for(int j=0; j < i; j++){
                    System.out.print("*");
            }
           
            //generate a new line
            System.out.println("");
    }
   
    //create second half of pyramid
    for(int i=5; i>0 ;i--){
           
            for(int j=0; j < i; j++){
                    System.out.print("*");
            }
           
            //generate A new line
            System.out.println("");
    }

	}

}
