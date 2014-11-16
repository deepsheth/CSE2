// Deep Sheth
// dss218
// Array Arithmetic
// Program takes user input and displays highest, lowest, and sum of numbers


public class ArrayMath{
  public static void main(String [] arg){
    //Initialzes arrays
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      
    v=addArrays(x,y);
    
    //Outputs results sum of arrays of if arrays are equal to each other
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = "+display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+" == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+" == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+" == "+display(z));
  }
  
  //Outputs arrays
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  //Determines if two arrays are equal to each other
  public static boolean equals(double[] array1, double[] array2){
      if (array1.length == array2.length) {
          for(int i=0; i<array1.length; i++){
              if (array1[i] == array2[i])
                continue;
              else
                return false;
          }
          return true;
      }
      else return false;
  }
  
  public static double[] addArrays(double[] array1, double[] array2) {
      int length1 = array1.length;
      int length2 = array2.length;

      // If arrays are not of equal length, new array with a higher length will be created
      if (length1 > length2) {
          double[] arraySum = new double[length1];
          double[] newArray = new double[length1];
            
          for(int i=0; i<length2; i++)
            newArray[i] = array2[i]; //Creates new array with more memory space
          for(int i=0; i<length1; i++)
            arraySum[i] = array1[i]+newArray[i]; //Finds sum of both arrays
          return arraySum;
      }
      
      //Same as code above, except for opposite scenario
      else if (length2 > length1) {
          double[] arraySum = new double[length2];
          double[] newArray = new double[length2];

          for(int i=0; i<length1; i++)
            newArray[i] = array1[i];
          for(int i=0; i<length2; i++)
            arraySum[i] = array2[i]+newArray[i];
          return arraySum;
      }
      
      //When both arrays are of equal length, they are added and sum is returned
      else {
        double[] arraySum = new double[length2];
        for(int i=0; i<length2; i++)
            arraySum[i] = array1[i]+array2[i];
        return arraySum;
      }
  } //end addArray method
} //end class