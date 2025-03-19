import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

 @Test
   @DisplayName("")
   void compareStringSearchTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertArrayEquals(new int[]{11, 4}, (int[]) method.invoke(null, new String[] {"A", "there", "", "", "", "d", "", "", "", "", "help"}, "help"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
    @Test
   @DisplayName("")
   void compareStringSearchTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertArrayEquals(new int[]{9, 2}, (int[]) method.invoke(null, new String[] {}, "there"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
    @Test
   @DisplayName("")
   void compareStringSearchTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertArrayEquals(new int[]{1, 3}, (int[]) method.invoke(null, new String[] {}, "A"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
  @Test
   @DisplayName("")
   void compareStringSearchTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String[].class, String.class };
         Method method = testClass.getDeclaredMethod("find", cArg);
         // Enter code here
         assertArrayEquals(new int[]{6, 1}, (int[]) method.invoke(null, new String[] {}, "d"));
      }

      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
