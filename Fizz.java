import java.util.Scanner;
class Fizz
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n=100;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();    
        System.out.println("Enter any Number" +n);
        for(int i=0;i<=n;i++)
        {
            if(i%5==0 && i%3==0)
            {
                System.out.println("FizzBuzz");
                
            }
            else if(i%5==0)
            {
                System.out.println("Fizz");
            }
            else if(i%3==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i+" ");
            }
        }
    }
    
}