class maximum
{
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        int count[] = new int[ASCII_SIZE];
      
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int maximum = -1; 
        char result = ' '; 
      
        for (int i = 0; i < len; i++) 
        {
            if (maximum < count[str.charAt(i)]) 
            {
                maximum = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
    public static void main(String[] args)
    {
        String str = "This is Chitkara University";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}