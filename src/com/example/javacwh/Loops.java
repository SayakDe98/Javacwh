/*In Java we can't write while(0) or while(1) or while(2) or while(any number)
This is not C++ orC where we can write while(0) or while(1) or while(any number) where 0 means false and any other number means true
In Java we have to write boolean values i.e. true or false
*/

package com.example.javacwh;

public class Loops {
    public static void main(String[] args) {
      //WARNING!!!!!!!! DON'T RUN INFINITE LOOPS IT WILL OVERHEAT YOUR PC AND MAY ALSO GET DESTROYED
        /* //infinite while loop
        while(true) System.out.println("This is an infinite while loop");
       */

        /*//infinite for loop
        for(int i=1;;i++) System.out.println("This is an infinite for loop");
        */
  /* //inifinite do-while loop
    do{
        System.out.println("This is an infinte do-while loop");
    }while(true);

   */
       // we use for loop when we know the ending condition precisely else we use while loop .we can use do while loop to execute something only once ,we can do the work of one loop wit anothr loop generally.

        //another way to code loops:
        //for(int i=5;i!=0;i--) System.out.println(i);
    }
}
