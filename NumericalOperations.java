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
    int n = 1234;
    
    int first = n % 10; 
    n = n / 10;
    
    int second = n % 10; 
    n = n / 10;
  
    int third = n % 10; 
    n = n / 10;

    int fourth= n % 10; 
    n = n / 10;
    
    first= first*1000;
    second= second*100;
    third= third*10;

    System.out.print(first+second+third+fourth);




  }
}