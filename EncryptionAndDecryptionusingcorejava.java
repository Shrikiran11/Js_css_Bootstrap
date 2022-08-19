import java.util.*;
class EncryptAndDecrypt{
    public static char[] encrypt(int key1,char[] arr1){
        char[] temp=new char[arr1.length];
        int res;
        if(key1%2==0)
        res=key1*key1*key1/key1*2;
        else
        res=key1*key1*key1/key1*2+1;
        for(int i=0;i<arr1.length;i++){
            temp[i]=(char)(arr1[i]+res);
        }
        System.out.print("encrypted Text:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(temp[i]);
        }
        System.out.println();
        return temp;
    }
    public static void decrypt(int key2,char[] arr2){
        char[] kemp=new char[arr2.length];
        int res1;
        if(key2%2==0)
        res1=key2*key2*key2/key2*2;
        else
        res1=key2*key2*key2/key2*2+1;
       
        for(int i=0;i<arr2.length;i++){
           kemp[i]=(char)(arr2[i]-res1);
          
        }
         System.out.print("Decrypted Text:");
        for(int i=0;i<arr2.length;i++){
           System.out.print(kemp[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the key to Encrypt");
        int key=scn.nextInt();
         System.out.println("Enter the String");
        String str=scn.next();
        char arr[]=str.toCharArray();
        char dum[]=new char[arr.length];
       dum=encrypt(key,arr);
        decrypt(key,dum);
    }
}