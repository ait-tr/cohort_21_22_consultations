public class Main {
    public static void main(String[] args) {
        System.out.println(checkBrackets("(()())")); // true
        System.out.println(checkBrackets("(()()")); // false
        System.out.println(checkBrackets(")()")); // false
    }

    public static boolean checkBrackets(String str){
        int counter=0;
        for (char ch: str.toCharArray()){
          if(ch=='(') counter++;
          if(ch==')'){
              counter--;
              if(counter<0) return false;
          }
        }
        return counter==0;
    }
}
