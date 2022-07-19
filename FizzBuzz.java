//Java文法①　課題2 3で割り切れるならFizz、5ならBuzz、両方で割れるならFizzBuzz
public class FizzBuzz{
    public static void main(String[] args){
           if(args.length == 0){
            return;
           }
           int max = Integer.parselnt(args[0]);
           for (int i=o; i<max; i++){
            int num = i+1;
            result="";
            if(num % 3 == 0){
                result=result+"Fizz";
            }
           if(num % 5 == 0){
               result=result+"Buzz";
           }
           if (result.length() == 0){
                      result=result+num;
           }
           System.out.print(result+"");
           }   
    }
}