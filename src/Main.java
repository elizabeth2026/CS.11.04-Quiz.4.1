public class Main {

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
//method numberOfVowels
public static int numberOfVowels(String str){
    int a = 0;
    for(int i = 0; i<str.length(); i++){
        String length = str.substring(i,i+1);
        if(length.equals("a") || length.equals("e") || length.equals("i") || length.equals("o") || length.equals("u")){
            a++;
        }
    }
    return a;
}

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
//method notDivisibleBy235
    public static int notDivisibleBy235(int n){
        int count = 0;
        for(int i = 0; i<=n; i++){
            int length = n-i;
            if(length%2!=0 && length%3!=0 && length%5!=0){
                count ++;
            }
        }
        return count;
    }

    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
//method camelCaseMe
    public static String camelCaseMe(String str){
        String result = "";
        for(int i = 0; i<str.length()-2; i++){
            String part = str.substring(i,i+1);
            if(part.equals("-")){
                String front = str.substring(0,i);
                String middle = str.substring(i+1,i+2).toUpperCase();
                String back = str.substring(i+2);

                result = front+middle+back;
            }
        }
        return result;
    }

}