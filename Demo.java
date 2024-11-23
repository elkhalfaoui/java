class Calculator {

    public Calculator() {
        System.out.println("class Calculator");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int add(int a, int b) {

        return a + b;
    }

    public static void addition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
public class Demo {
    public static void main(String args[]) {

        Calculator obj1 = new Calculator();

        int a = obj1.add(176, 17);
        
        System.out.println(a);

        Calculator.addition(1, 3);

        int[] arr = new int[2];
        System.out.println(arr[0]);
        int[] nums = {1,2,3};
        for(int i:nums) {

            System.out.println(i);
        }

        int multi [][] = new int[3][3];
        for(int one[]:multi) {
            for(int two:one) {
                System.out.print(two + " ");
            }
            System.out.println();
        }

        int jagged [][] = new int[3][];
        jagged[0] = new int[5];
        jagged[1] = new int[9];
        jagged[2] = new int[1];

        for(int one[]:jagged) {
            for(int two:one) {
                two = 1; //! it will not change the original array
                System.out.print(two + " ");
            }
            System.out.println();
        }
        System.out.println(jagged[0][0]);

        Calculator objArr[] = new Calculator[1];
        objArr[0] = obj1;
    }
}