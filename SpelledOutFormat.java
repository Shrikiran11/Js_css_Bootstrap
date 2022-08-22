
import java.util.Scanner;
class SpelledOutFormat {
    // A function that prints
    // given number in words
    static void convert_to_words(char[] num)
    {
        // Get number of digits
        // in given number
        int len = num.length;
  
        
        if (len == 0) {
            System.out.println("empty string");
            return;
        }

        if (len > 4) {
            System.out.println(
                "Length more than 4 is not supported");
            return;
        }
  
        /* The first string is not used, it is to make
            array indexing simple */
        String[] single_digits = new String[] {
            "zero", "one", "two",   "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
  
        /* The first string is not used, it is to make
            array indexing simple */
        String[] two_digits = new String[] {
            "",          "ten",      "eleven",  "twelve",
            "thirteen",  "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };
  
        /* The first two string are not used, they are to
         * make array indexing simple*/
        String[] tens_multiple = new String[] {
            "",      "",      "twenty",  "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
  
        String[] tens_power
            = new String[] { "hundred", "thousand" };
  
        /* Used for debugging purpose only */
        System.out.print(String.valueOf(num) + ": ");
  
        /* For single digit number */
        if (len == 1) {
            System.out.println(single_digits[num[0] - '0']);
            return;
        }
  
        /* Iterate while num
            is not '\0' */
        int x = 0;
        while (x < num.length) {
  
            /* Code path for first 2 digits */
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(
                        single_digits[num[x] - '0'] + " ");
                    System.out.print(tens_power[len - 3]
                                     + " ");
                    // here len can be 3 or 4
                }
                --len;
            }
  
            /* Code path for last 2 digits */
            else {
                /* Need to explicitly handle
                10-19. Sum of the two digits
                is used as index of "two_digits"
                array of strings */
                if (num[x] - '0' == 1) {
                    int sum
                        = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(two_digits[sum]);
                    return;
                }
  
                /* Need to explicitly handle 20 */
                else if (num[x] - '0' == 2
                         && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                }
  
                /* Rest of the two digit
                numbers i.e., 21 to 99 */
                else {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(tens_multiple[i]
                                         + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(
                            single_digits[num[x] - '0']);
                }
            }
            ++x;
        }
    }
  public static void spell(char[] array){
 int l=array.length;
String dummy=" ";
for(int i=0;i<l;i++){
char temp=array[i];
String val=" ";
switch(temp){
case '0':
val="zero";
break;
case '1':
val="one";
break;
case '2':
val="two";
break;
case '3':
val="three";
break;
case '4':
val="four";
break;
case '5':
val="five";
break;
case '6':
val="six";
break;
case '7':
val="seven";
break;
case '8':
val="eight";
break;
case '9':
val="nine";
break;
}
dummy=dummy+" "+val;
}
System.out.println("output2:"+dummy);
}
    // Driver Code
    public static void main(String[] args)
    {
Scanner scn=new Scanner(System.in);
String num1=scn.next();
convert_to_words(num1.toCharArray());
spell(num1.toCharArray());
    }    
    
}