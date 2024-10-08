public class TypeCasting {
    public static void main(String[] a) {
        int i = 22;
        byte b;
        b = (byte)i;
        System.err.println(b);

        char c = 'a';
        int letter;
        letter = c; // => 97; no need for type casting from char to int and the opposite is imposible
        System.out.println(letter);


        double d = 3.14;
        float f;
        f = (float)d;
        System.err.println(f);

        float fl = 3.14f;
        double doub;
        doub = fl;
        System.err.println(doub); // => 3.140000104904175 :)

        int num2 = 259;
        byte num3 = (byte)num2; // num2 % 256[the range of byte from -128 to 127] => 3
        System.err.println(num3);

        float num4 = 4.4f;
        int num5 = (int)num4;
        System.out.println(num5); // => 4

        byte num6 = 20;
        byte num7 = 30;
        int result = num6*num7; // type promotion [600 is out of byte range]
        System.err.println(--result); // pre decrement
        System.err.println(3>0); // false
        boolean test = 3>9;
        System.out.println(test);

        int num8 = 99;
        byte num9 = 99;
        System.out.println(num8 == num9 & 1 >= 1); //true
        // short socket: && if first condition false => false
        // short socket: || if first condition true => true

        if(num2 < 9) 
            System.err.println("Nice");
         else if(num2 > 9) {
            System.out.println("Bad");
        }
        // System.out.print(3>99?"Right":"Wrong");

        // switch(num5) {
        //     case 1:
        //         System.out.println("one");
        //         break;
        //     case 2:
        //         System.out.println("two");
        //         break;
        //     case 3:
        //         System.out.println("three");
        //         break;
        //     case 4:
        //         System.out.println("four");
        //         break;
        //     case 5:
        //         System.out.println("five");
        //         break;
        //     default:
        //         System.out.println("out of range");
        //         break;
        // }
        switch(num5) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("out of range");
        }
        int condition = 0;
        while(condition < 10) {
            System.out.println("Zakaria is learning java:8 and Germany " + condition);
            condition++;
        }
        System.out.println(condition);
        do{
            System.out.println("do while execute one or more but while can get execute 0 time");
        } while (false);

        for(byte j = 0; j<10; j++) {
            if(j%2 == 1) 
                continue;
            for(byte ll = 0; ll< 10-j/2; ll++) {
                System.out.print(" ");
            }
            for(byte k=0; k<=j; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
