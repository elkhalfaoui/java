public class Demo {
    public static void main(String args[]) {
        
        int nums[][] = {{5, 3}, {6}, {7}};
        int arr[][] = new int[10][10]; // => {0, 0, 0, 0}
        System.out.println(arr[0][1] + nums[0][1]);
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = 10 * i + j;
            }
        }
        for (int[] arr1 : arr) {
            for (int arr2 : arr1) {
                System.out.print(arr2 + " | ");
            }
            System.out.println();
        }
        int rand = (int)(Math.random() * 4);
        //! (int:to convert the double number to int)(Math.random(give you a double between 0.0 and 0.9)
        //!  * 4 the range is 4 from 0 to 3)
        System.out.println(rand);

        int jagged[][] = new int[4][];
        jagged[0] = new int[4];
        jagged[1] = new int[3];
        jagged[2] = new int[6];
        jagged[3] = new int[8];
    }
}
