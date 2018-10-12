class sub
{
 public static void main(String args[])
 {
  String string,sub;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the string");
  string=s.nextLine();
  System.out.println("All substrings are:");
   for (int i=0;i<string.length();i++) {
   for (int j=i+1;j<=string.length();j++) {
         System.out.println(string.substring(i,j));
   }
  }
 }
}