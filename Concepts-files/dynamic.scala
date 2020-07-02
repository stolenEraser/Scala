// GENERATED

/* INSTRUCTIONS
 *
 * Complete the exercises below.  For each "EXERCISE" comment, add
 * code immediately below the comment.
 *
 * Please see README.md for instructions, including compilation and testing.
 * 
 * GRADING
 * 
 * 1. Submissions MUST compile using SBT with UNCHANGED configuration and tests with no
 *    compilation errors.  Submissions with compilation errors will receive 0 points.
 *    Note that refactoring the code will cause the tests to fail.
 *
 * 2. You MUST NOT edit the SBT configuration and tests.  Altering it in your submission will
 *    result in 0 points for this assignment.
 *
 * 3. You may declare auxiliary functions if you like.
 *
 * SUBMISSION
 *
 * 1. Push your local repository to the repository created for you on GitHub before the deadline.
 *
 * 2. Late submissions will not be permitted because solutions will be discussed in class.
 * 
 */

object dynamic {

  trait Internationalization {
    def greet (name : String) : String
  }

  // EXERCISE 1: complete the following function.
  // It has two parameters: 
  // - i18n : (a reference to) an instance of a class that extends / implements the Internationalization trait (interface) defined above.
  // - name : a String
  // You should use the "greet" method of "i18n" to find a greeting for "name".  Return the result.
  def useGreet (i18n : Internationalization, name : String) : String = {
    // TODO: Provide definition here.
    i18n.greet(name);
  }

  // EXERCISE 2: complete the following function.
  // It should return an instance of a class that extends / implements the Internationalization trait (interface) defined above.
  // The "greet" method should return a String consisting of "Hello", a space, and the name given as an argument.
  // You can either define classes inside the newEnglish method or directly inside the "dynamic" object.
  def newEnglish () : Internationalization = {
    // TODO: Provide definition here.
    class ClassInstance extends Internationalization{

      override def greet(name:String): String={
        "Hello"+" "+name;
      }
    }
    //create class instance
    val g= new ClassInstance(); 

    //return instance of Class
    g; 
    
  }

  // EXERCISE 3: complete the following function.
  // It should return an instance of a class that extends / implements the Internationalization trait (interface) defined above.
  // The "greet" method should return a String consisting of "Bonjour", a space, and the name given as an argument.
  // You can either define classes inside the newFrench method or directly inside the "dynamic" object.
  def newFrench () : Internationalization = {
    // TODO: Provide definition here.
    class classInstance1 extends Internationalization{
      override def greet(name:String): String={
        "Bonjour"+" "+ name;
      }
    }

    val c= new classInstance1();
    c;
  }
}

