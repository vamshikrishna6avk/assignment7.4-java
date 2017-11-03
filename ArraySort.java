package sorting;//created package as sorting

	public class ArraySort {//created class as ArraySort
		                    //classes are the basics of oops(object oriented programming)

	    public static void main(String[] args) { // Main Method
	    	//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
			//main is name of method
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter
	        
	        int [] r = {33, 85, 2, 23, 77, 3, 44, 8, 52, 7}; // Initialize the array 
	        
	        System.out.println("Array of elements:");//system is used to return code
	           //out is a static member
	         	//Println is used to print text  and gives output 
	        printArray(r, r.length); // Prints the whole array 
	        r = recursiveCall(r, r.length, 0); // Create Recursion object
	        System.out.println("\n\nArray after sorting:"); //Prints the sorted array 
	      //system is used to return code
	           //out is a static member
	         	//Println is used to print text  and gives output 
	        printArray(r, r.length);//length
	    }
	    
	    public static int[] recursiveCall(int[] r, int n, int index){ //Recursive Method
	        int temp;
	        /** Compare the elements in the array one by one 
            and put the smallest number at the top and the largest
            number at the end of the array 
            **/
	       
	         if(n==index){
	            return r;//returns array
	        }else{
	            for(int i=index+1;i<n;i++){ //for loop
	            	if(r[index]>r[i]){ //index greater than r      
	                    temp = r[index];//temp equal to index
	                    r[index] = r[i];
	                    r[i] = temp;
	                }
	            }
	            index++;
	            recursiveCall(r, n, index); // Recursion Call
	        }
	        
	        return r; //return array
	        
	    }
	    
	    public static void printArray(int[] arr, int len){//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
	        for(int i=0; i<len; i++){
	            if(i==len-1){ // Sort array in ascending order 
	                System.out.print(arr[i]); // Prints the sorted array in ascending order 
	              //system is used to return code
	 	           //out is a static member
	 	         	//Print is used to print text  and gives output 
	            }else{
	                System.out.print(arr[i] + " "); // Puts spaces between the elements of array
	            }
	        }
	    }

	}