public class NumericalOperations{
  public static void main(String args[]){
    
  //Challenge 1
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;
    
    System.out.println(57.2 * (i1 / i2) + 1);
    System.out.println(57.2 * ((double)i1 / i2) + 1);
    System.out.println(15 - i1*(d1*3) + 4);
    System.out.println(15 - i1*((int)d1*3) + 4);
    System.out.println(15 - i1*(int)(d1*3) + 4);
    

    //Challenge 2
    String n ="1234";
    int midpoint = n.length()/2;
    String first = n.substring(0,midpoint);
    String second = n.substring(midpoint);
    System.out.println(second + first);




  }
}