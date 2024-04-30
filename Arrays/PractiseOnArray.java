package Arrays;

public class PractiseOnArray {

    public static void update(int marks[], int nonChangable)
    {
        nonChangable= 10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i] += 1;
        }
    }
    public static int linearSearch(int numbers[], int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(key == numbers[i])
            return i;
        }
        return -1;
    }
    public static int linearSearchForMenu(String menu[], String key[])
    {
        for(int i=0;i<menu.length;i++)
        {
            if(key[0] == menu[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int largestNum(int arr[])
    {
        
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest < arr[i])
                {
                    largest = arr[i];
                }
        }
        return largest;
    }
    public static int smallestNum(int arr[])
    {
        
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(smallest > arr[i])
                {
                    smallest = arr[i];
                }
        }
        return smallest;
    }
    public static int binarySearch(int arr[], int key)
    {
        int low = 0;
        int high = arr.length-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(key == arr[mid])
            return mid;
            else if(key > arr[mid])
            {
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void reverseAnArray(int arr[])
    {
        //#region basic approach to print a array Reverse
        System.out.println("Array reversed using basic approach...");
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[j]+" ");
            j--;
        }
        System.out.println();
        //#endregion    
        //#region standard approach to print reversed array
        int first  = 0;
        int last = arr.length-1;
        while(first<last)
        {
            int temp= arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }

        System.out.println("Array reversed using second apporach");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        //#endregion
    }
    public static void pairsInArray(int arr[])
    {
        //#region basic approach
        System.out.println("Making Pairs in the Array");
        
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+") ");
                
            }
            System.out.println();
        }
        int totalPairs = arr.length*(arr.length -1)/2; //formula to make total pairs
        System.out.println("Total pairs:"+ totalPairs);
        System.out.println();
        //#endregion
    }
    public static void subArray(int arr[])
    {
        System.out.println("Subarray");

        int highestSum = Integer.MIN_VALUE;
        int lowestSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum =0; // initializing the sum with the value 0 every time
                // int maxsumarray[] =new int[arr.length];
                for(int k = i;k<=j;k++)
                {
                    System.out.print(arr[k] +" ");
                    sum+= arr[k]; // adding the subarray values
                    // maxsumarray[k]=arr[k];
                }
                //#region used to compare the highest or lowest sum
                    if(sum > highestSum)
                    highestSum = sum;
                    else
                    lowestSum = sum;
                System.out.println();
            }
            System.out.println();
        }
        int totalsubarray = arr.length*(arr.length+1)/2;
        System.out.println("Total SubArrays are: "+totalsubarray);
        System.out.println("highest and lowest sum of sub arrays are is: "+highestSum+" and "+lowestSum);
        System.out.println();
    }
    public static void subArray1(int arr[])
    {
        System.out.println("Subarray");

        int sum =0;
        int highestSum = Integer.MIN_VALUE;
        int lowestSum = Integer.MAX_VALUE;
        int prefix[]= new int[arr.length];

        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                // if(sum > highestSum)
                // {
                //     highestSum = sum;
                // }
                // else
                // {
                //     lowestSum = sum;
                // }
                if(sum > highestSum) highestSum = sum;
                else lowestSum = sum;
                System.out.println();
            }
            System.out.println();
        }
        int totalsubarray = arr.length*(arr.length+1)/2;
        System.out.println("Total SubArrays are: "+totalsubarray);
        System.out.println("highest and lowest sum of sub arrays are is: "+highestSum+" and "+lowestSum);
        System.out.println();
    }
    public static void kadanesAlgo(int arr[])
    {
        System.out.println("Kadanes Algorithm");

        int MaxSum = arr[0];
        int currentSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            currentSum += arr[i];
            if(currentSum > MaxSum)
                MaxSum = currentSum;
            if(currentSum < 0)
                currentSum =0;
        }
        System.out.println("MaxSum By kadanes algorithm: "+ MaxSum);
    }


    public static void main(String args[])
    {
        int numbers[]={80,2,4,6,8,10,12,14,16};
        int key = 10;

        // #region linearSearch 
        int index1 = linearSearch(numbers, key);
        if(index1 == -1 )
        {
            System.out.println("Key Not Found");
        }
        else
        {
            System.out.println("Key found at index: "+ index1);
        }
        //#endregion
        //#region  linearSearchForMenu
        String menu[] = {"dosa", "chole bhature", "samosa"};
        String key1[] = {"samosa"};

        int index = linearSearchForMenu(menu, key1);
        if(index == -1 )
        {
            System.out.println("dish Not Found");
        }
        else
        {
            System.out.println("dish found at index: "+ index);
        }
        //#endregion
        //#region largestNum
        int result = largestNum(numbers);
        System.out.println("largest value is : "+result);
        //#endregion
        //#region smallestNum
        int result1 = smallestNum(numbers);
        System.out.println("smallest value is : "+result1);
        //#endregion
        //#region binarySearch
        int result2 = binarySearch(numbers, key);
        if(result2 == -1)
        {
            System.out.println("key Not Found");
        }
        else{
            System.out.println("Key found at index: "+ result2);
        }
        //#endregion
        //#region reverseAnArray
        reverseAnArray(numbers);
        // System.out.println("Array reversed using second apporach");
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        //#endregion
        //#region pairsInArray
        int arr[]={2,3,4,5,6};    
        pairsInArray(arr);
        //#endregion
        //#region subArray subArray1
            int arr1[]={2,4,6,8,10};
            subArray(arr1);
        //#endregion
        //#region kadensAlgo
            kadanesAlgo(arr1);
        //#endregion



    }
}

