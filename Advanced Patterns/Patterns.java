import java.util.Scanner;
public class Patterns {

    public static void main(String args[])
    {
        HollowRectangle h = new HollowRectangle();
        h.check_hollow(4,5);

        Inverted_And_RotatedHalf_Pyramid i = new Inverted_And_RotatedHalf_Pyramid();
        i.calculate(5);
        i.calculate1(5);
        i.floyds_triangle(5);
        i.zero_one_triangle(5);
        i.butterfly(4);

        Rhombus r = new Rhombus();
        r.calculateRhombo(5);
        r.calculatehollowRhombo(5);

        Diamond  d = new Diamond();
        d.calculateDiamond(4);

        LiveClass l = new LiveClass();
        l.numberTriangle(5);
        l.palindromeTriangle(5);

        l.test(4);
    }
}

class HollowRectangle
{
     void  check_hollow(int row,int col)
    {
        //outer loop
        for(int i=1; i<=row;i++)
        {
            //inner loop
            for(int j = 1; j<= col;j++)
            {
                if(i ==1 || i==row|| j==1||j==col)
                System.out.print("* ");
                else 
                {
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
    }
}

class Inverted_And_RotatedHalf_Pyramid
{
    public static void calculate(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void calculate1(int n)
    {
        // //Type 1
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j = 1;j<=i;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Type 2 
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n)
    {
        int count = 1 ;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)//even
                {
                    System.out.print("1 ");
                }
                else{//odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n)
    {
        //upper triangles (ascending)
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            // for(int j=1;j<=n-i;j++)
            // {
            //     System.out.print("  ");
            // }
            // for(int j=1;j<=n-i;j++)
            // {
            //     System.out.print("  ");
            // }
            // or
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower triangles  (descending) reverse all the loops
        for(int i=n;i>=1;i--)
        {
            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("* ");
            // }
            // // for(int j=n-i;j>=1;j--)
            // // {
            // //     System.out.print("  ");
            // // }
            // // for(int j=n-i;j>=1;j--)
            // // {
            // //     System.out.print("  ");
            // // }
            // // or
            // for(int j=2*(n-i);j>=1;j--)
            // {
            //     System.out.print("  ");
            // }
            // for(int j=i;j>=1;j--)
            // {
            //     System.out.print("* ");
            // }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Rhombus
{
    public static void calculateRhombo(int n)
    {
        int counter=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=counter;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            counter--;
        }
    }
    public static void calculatehollowRhombo(int n)
    {
        int counter = n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=counter;j++)
            {
                System.out.print("  ");
            }
            
            //first way
            // if(i==1 || i==n)
            // {
            //     for(int j=1;j<=n;j++)
            //     {
            //         System.out.print("* ");
            //     }
            // }
            // else
            // {

            //     for(int j=1;j<=n;j++)
            //     {
            //         if(j==1 || j==n)
            //         {
            //             System.out.print("* ");
            //         }
            //         else
            //         {
            //             System.out.print("  ");
            //         }
            //     }
            // }
            
            // Second Way
                // for(int j=1;j<=n;j++)
                // {
                //     if(i==1 || i==n)
                //     {
                //         System.out.print("* ");
                //     }
                //     else
                //     {
                //         if(j==1 || j==n)
                //         {
                //             System.out.print("* ");
                //         }
                //         else
                //         {
                //             System.out.print("  ");
                //         }
                //     }       
                // }
                
                 for(int j=1;j<=n;j++)
                {
                    if(i==1 || i==n ||j==1 ||j==n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                            System.out.print("  ");
                    }
                        
                }
                counter--;
                System.out.println();
        }
    }
}

class Diamond
{
    public static void calculateDiamond(int n)
    {
        //for upper pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //for lower pyramid or inverted pyramid
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class LiveClass
{
    public static void numberTriangle(int n)
    {
        //main loop
        for(int i=1;i<=n;i++)
        {
            //loop to print spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //loop to print numbers in pyramid form
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void palindromeTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void test(int m)
    {
        int n= m+(m-1);
        int z=m;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                 if(i ==1 || i==n || j==1 || j==n )
                 {
                     System.out.print(m);
                 }
                 else
                 System.out.print(" ");
            }
            System.out.println();
            z--;
        }
    }

}

