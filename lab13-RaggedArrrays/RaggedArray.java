// Deep Sheth
// dss218
// Ragged Array
// Nov. 5, 2014
// PURPOSE OF PROGRAM

public class RaggedArray {
    public static void main(String[] args){
        int[][] array = new int[5][];

        //CREATES SIZS
        for(int i=0, j=1; i<array.length; i++, j++)
            array[i] = new int[j*3+5];
        
        //INSERTS RANDOM NUMBERS    
        for(int row=0; row<array.length; row++)
            for(int column=0; column<array[row].length; column++) {
                array[row][column] = (int)(Math.random()*40);
        }
        
        System.out.println("Array before sort:"); display(array);
        
        // SELECTION SORT
        for(int row=0; row<array.length; row++){
            for(int index1=0; index1<array[row].length-1; index1++){
                int currentMin = array[row][index1];
                for(int index2=index1+1; index2<array[row].length; index2++){
                    // 
                    if (currentMin > array[row][index2]){
                       //Must need variable because both numbers cannot be switch simultaneously 
                       currentMin = array[row][index2];
                       array[row][index2] = array[row][index1];
                       array[row][index1] = currentMin;
                    }
                }
            }
        }
        System.out.println("\nArray after sort:"); display(array);
    }

    public static void display(int array[][]){
        for(int row=0; row<array.length; row++){
            for(int column=0; column<array[row].length; column++)
                System.out.print(array[row][column] + " ");
            System.out.println();
        }
    }
    
}