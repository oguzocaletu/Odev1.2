import org.junit.Test;
public class Soru2Test {
     @Test void Throw_whenNullArrayGiven(){
        int[]arr;
        assertThrows(throw IllegalArgumentException.class,()->{
            Soru2.multiplation(arr)
        });
     }
     @Test void Throw_whenOneELementIsZero(){
        int[]arr={1,2,3,0};
        assertThrows(throw IllegalArgumentException.class,()->{
            Soru2.multiplation(arr)
        });
     }
     @Test void returnValueOfMultiplication(){
        int[]arr{1,2,3,4};
        assertEquals(24,arr);
     }
     @Test void returnZero_whenGİvenArrayLengthZero(){
        int[]arr=new int[0];
        assertEquals(0,arr);
     }
     @Test void returnValueOfMultiplication(){
        int[]arr{1,2,3,4,5};
        assertEquals(120,arr);
     }
}
