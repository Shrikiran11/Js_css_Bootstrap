import java.util.*;
class VowelsReplace
{
    public static void main(String[] args)
    {
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    String dummy="";
    char[] arr=str.toCharArray();
    for(int i=0;i<arr.length;i++){
    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
        dummy=dummy+'*';
        }
    else{
        dummy=dummy+arr[i];
        }
        }
    System.out.println(dummy);
    String newStr="";
    char[] newArr=dummy.toCharArray();
    for(int i=0;i<newArr.length;i++){
        if(i%2==0)
            newStr=newStr+newArr[i];
        else
            newStr=newStr+'#';
        }
    System.out.println(newStr);
    }
}