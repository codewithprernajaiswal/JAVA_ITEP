class Test{
    public static void main(String args[])
    {
        int[] arr={1,0,0,1,0,1,1};
        int count=0;
    for(int i=0;i<arr.length;i++)
    {
        int onecount,zerocount;
        onecount=0;
        zerocount=0;
        
        if(arr[i]==1)
        {
            onecount++;
        }
        else
        zerocount++;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]==1)
        {
            onecount++;
        }
        else
        zerocount++;

        if(onecount==zerocount)
        {
            count++;
        }
        }

    }
    System.out.print(count);

    }
    
}