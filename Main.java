public class Main {
  public static void main(String[] args) {
    int myNum = 5; // integer (whole number)
    float myFloatNum = 5.99f; // floating point number
    char myLetter = 'D'; // character
    boolean myBool = true; // boolean
    String myText = "Hello"; // String
    double myDouble = 20; // double
    byte myByte = 2;
    short myShort = 45;
    long myLong = 342342342l;
    float myFloat = 546.324f;
    char myChar = 'A';

    Object[] typesList = { myNum, myFloatNum, myLetter, myBool, myText, myDouble, myByte, myShort, myLong, myFloat,
        myChar };

    for (Object type : typesList) {
      log(type);
    }
  }

  /*
   * Notice the use of the Object Param
   * It is used when the param can have any type
   * When you pass a primitive value,
   * it will be automatically boxed into its wrapper type,
   * e.g an int would be converted to java.lang.Integer which extends Object.
   */
  public static void log(Object message) {
    System.out.println(message);
  }
}
