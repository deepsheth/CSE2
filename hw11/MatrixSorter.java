public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d(); // Creates 3D array with random numbers
        show(mat3d); // Displays array
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]); // Sorts rows & array members
        show(mat3d); // Displays array with sorted third slab
    }
    
    public static int[][][] buildMat3d() {
        // Creates 3 slabs
        int[][][] array = new int[3][][];
        
        // Creates rows & entries  
        for(int slab=0; slab<array.length; slab++) { // for each slab
            array[slab] = new int[2*slab+3][]; // creates rows
            for(int row=0; row<(3+2*slab); row++){ // for each row
                array[slab][row] = new int[slab+row+1]; // creates members
                for(int entries=0; entries<(slab+row+1); entries++) {
                    array[slab][row][entries] = (int)(Math.random()*100)+1; //Random numbers from [1,99]
                }
            }
        }
    return array; 
    }
    
    // OUTPUTS ARRAY
    public static void show(int[][][] array){
        for(int slab=0; slab<array.length; slab++) { //for each slab
            System.out.println("--------------------------- Slab "+ (slab+1));
            for(int row=0; row<array[slab].length; row++){ // defines length of rows
                for(int entries=0; entries<array[slab][row].length; entries++) {
                    System.out.print(array[slab][row][entries] + " "); //outputs numbers
                }
                System.out.println();
            }
        }
        System.out.println("---------------------------"); 
    }
    
    // FINDS MINIMUM
    public static int findMin(int[][][] array) {
        int min = array[0][0][0];
        // Determines minium using linear search 
        for(int slab=0; slab<array.length; slab++) { //for each slab
            for(int row=0; row<array[slab].length; row++){ // defines length of rows
                for(int entries=0; entries<array[slab][row].length; entries++) {
                    if ((array[slab][row][entries]) < min){
                        min = array[slab][row][entries];
                    }
                }
            }
        }
        return min;
    }
    
    public static void sort(int[][] array) {
        for(int entries=0; entries<array.length; entries++) //for each array member
            sort(array[entries]); //runs overload method
            
        //INSERSION SORT to sort rows
        for(int rows=0; rows<array.length; rows++) {
            int rowCount = rows;
            int temporary[];
            while(rowCount !=0 && (array[rowCount][0] < array[rowCount-1][0])) {
                temporary = array[rowCount-1];
                array[rowCount-1] = array[rowCount];
                array[rowCount] = temp;
                rowCount--;
            }
        }
    }
    
    public static void sort(int[] array) {
        
        // SELECTION SORT to sort array columns
        for(int index1=0; index1<array.length-1; index1++){
            int currentMin = array[index1];
            for(int index2=index1+1; index2<array.length; index2++){
                // 
                if (currentMin > array[index2]){
                   //Must need variable because both numbers cannot be switch simultaneously 
                   currentMin = array[index2];
                   array[index2] = array[index1];
                   array[index1] = currentMin;
                }
            }
        }
        
    }
}