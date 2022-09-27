/* Problem Statement
Palindrome is a word, phrase, or sequence that reads the same backwards as forwards. Use recursion to check if a given string is palindrome or not. */
static boolean check_Palindrome(String str,int s, int e) 
{ 
//enter your code here
    if(s == e){
        return true;
   }

   if(str.charAt(s) != str.charAt(e)){
       return false;
   }

   if(s < e +1){
     return check_Palindrome(str, s + 1, e-1);
   }
     return true;

}