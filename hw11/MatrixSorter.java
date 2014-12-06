public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
              findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d() {
        // Creates 3 slabs
        int[][][] array = new int[3][][];
        
        // Creates rows & entries  
        
        for(int slab=0; slab<array.length; slab++) { //for each slab
            array[slab] = new int[2*slab+3][];
            for(int row=0; row<(3+2*slab); row++){ // defines length of rows
                array[slab][row] = new int[slab+row+1];
                for(int entries=0; entries<(slab+row+1); entries++) {
                    array[slab][row][entries] = (int)(Math.random()*100)+1;
                }
            }
        }
        
        return array;
    }
    
    public static void show(int[][][] array){
        for(int slab=0; slab<array.length; slab++) { //for each slab
            System.out.println("--------------------------- Slab "+ (slab+1));
            for(int row=0; row<array[slab].length; row++){ // defines length of rows
                for(int entries=0; entries<array[slab][row].length; entries++) {
                    System.out.print(array[slab][row][entries] + " ");
                }
                System.out.println();
            }
            
        }
        System.out.println("---------------------------");
        
    }
    
    public static int findMin(int[][][] array) {
        int min = array[0][0][0];
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
            sort(array[entries]);
        
        for(int rows=0; rows<array.length; rows++) {
            int rowCount = rows;
            int temp[];
            while(rowCount !=0 && (array[rowCount][0] < array[rowCount-1][0])) {
                temp = array[rowCount-1];
                array[rowCount-1] = array[rowCount];
                array[rowCount] = temp;
                rowCount--;
            }
                
        }
    }
    
    public static void sort(int[] array) {
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