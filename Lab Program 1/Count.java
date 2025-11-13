class Count
{
    public static void main(String[] args) {
        int i,j;
        int n=args.length;
        for(i=0;i<n;i++)
        {
            int count=1;
            for(j=i+1;j<n;j++)
            {
                if(args[i].equalsIgnoreCase(args[j]))
                {
                    count++;
                    args[j]=" ";
                }
            }
            if(!args[i].equals(" "))
            {
                System.out.println(args[i]+":"+count);
            }
        }
    }
}