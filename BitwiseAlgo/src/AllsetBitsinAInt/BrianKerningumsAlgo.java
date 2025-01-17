/*
Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit.
for example :
10 in binary is 00001010
9 in binary is 00001001
8 in binary is 00001000
7 in binary is 00000111
So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If we do n & (n-1) in a loop and count the number of times the loop executes, we get the set bit count.
The beauty of this solution is the number of times it loops is equal to the number of set bits in a given integer.

1  Initialize count: = 0
   2  If integer n is not zero
      (a) Do bitwise & with (n-1) and assign the value back to n
          n: = n&(n-1)
      (b) Increment count by 1
      (c) go to step 2
   3  Else return count

   tool :- https://www.rapidtables.com/convert/number/decimal-to-binary.html
    Time Complexity: O(log n)
    Auxiliary Space: O(1)
 */


package AllsetBitsinAInt;

import java.util.Scanner;

public class BrianKerningumsAlgo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CALCULATE THE SET BITS IN A NUMBER :");
        int a = myScan.nextInt();

        System.out.println( FirstSetBit(a));
    }

    public static int  FirstSetBit (int n ){

        int count = 0;

        while(n > 0){
            n = n & (n - 1);
             count++;
        }

        return count ;

    }
}

/*
   n =  9 (1001)
   count = 0

   Since 9 > 0, subtract by 1 and do bitwise & with (9-1)
   n = 9&8  (1001 & 1000)
   n = 8
   count  = 1

   Since 8 > 0, subtract by 1 and do bitwise & with (8-1)
   n = 8&7  (1000 & 0111)
   n = 0
   count = 2

   Since n = 0, return count which is 2 now.
 */