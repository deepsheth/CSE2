// Deep Sheth
// dss218
// Array Arithmetic
// Program takes user input and displays highest, lowest, and sum of numbers


public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      
    v=addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = "+display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+" == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+" == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+" == "+display(z));
  }
  
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

      
      
      if (length1 > length2) {
          double[] arraySum = new double[length1];
          double[] newArray = new double[length1];

          for(int i=0; i<length2; i++)
            newArray[i] = array2[i];
          for(int i=0; i<length1; i++)
            arraySum[i] = array1[i]+newArray[i];
            
          return arraySum;
      }
      
      else if (length2 > length1) {
          double[] arraySum = new double[length2];
          double[] newArray = new double[length2];

          for(int i=0; i<length1; i++)
            newArray[i] = array1[i];
          for(int i=0; i<length2; i++)
            arraySum[i] = array2[i]+newArray[i];
            
          return arraySum;
      }
      
      else {
        double[] arraySum = new double[length2];
        for(int i=0; i<length2; i++)
            arraySum[i] = array1[i]+array2[i];
        return arraySum;
      }
      
      
  }
}
