public class Kata8 {
    public static String evenOrOdd(int number) {//Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
        if (number % 2 == 0) return "Even";
        return "Odd";
    }
    public static String evenOrOddL(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        return x; // Your code here.
    }
    public static int makeNegativeL(final int x) {
        return (x > 0) ? -x : x;
    }
    public static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = (i > 0) ? result += i : result;
        }
        return result;
    }
    public static String solutionL(String str) {

        return new StringBuilder(str).reverse().toString();
    }
    public static String solution(String str) {
        String result = "";
        for (int i = str.length(); i >= 0; i--)
            result += str.toCharArray()[i];
        return result;
    }
    public static String numberToString(int num) {

        return "" + num;
    }
    public static String numberToStringL(int num) {

        return Integer.valueOf(num).toString();
    }
    public static String boolToWord(boolean b) {
        return (b) ? "Yes" : "No";
    }
    public static int opposite(int number) {
        return -number;
    }
    public static String remove(String str) {
        StringBuilder string = new StringBuilder(str);
        string.deleteCharAt(0);
        string.deleteCharAt(str.length() - 2);
        return string.toString();
    }
    public static int squareSum(int[] n) {
        int r = 0;
        for (int i = 0; i < n.length; i++) {
            r += n[i] * n[i];
        }
        return r;
    }
    public static String repeatStr(final int repeat, final String string) {
        String str = "";
        for (int i = 1; i <= repeat; i++) {
            str += string;
        }
        return str;
    }
    public static int summation(int n) {
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r += i;
        }
        return r;
    }
    public static int summationL(int n) {
        return n * (n + 1) / 2;

    }
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int arg : args) {
            min = (min > arg) ? arg : min;
        }
        return min;
    }
    public static String noSpace(final String x) {
        String r=x.replaceAll("\\s+","");
        return r;
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if(arrayOfSheeps==null) return 0;
        int r=0;
        for(boolean sheep:arrayOfSheeps) r+=(sheep)? 1:0;
        return r;
    }
    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        int r=0;
        for(int i=0;i<arrayOfSheeps.length;i++) {
            if(arrayOfSheeps[i]==null) ;
            else if (arrayOfSheeps[i]){r+=1;}
        }
        return r;
    }
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op){
            case"+" -> {return v1+v2;}
            case"-" -> {return v1-v2;}
            case"*" -> {return v1*v2;}
            case"/" -> {return (v2!=0)? v1/v2:0;}
        }
        return null;
    }
    public static int stringToNumber(String str) {
        int a=0;
        return a=Integer.valueOf(str);
    }
    public static String abbrevName(String name) {
        String result="";
        result=name.split(" ")[0].toUpperCase().charAt(0)+"."+name.split(" ")[1].toUpperCase().charAt(0)+"";
        System.out.println(result);



        return result;
    }
    public static int century(int number) {
        return (number%100==0) ? number/100:1+number/100;

    }
    public int Liters(double time)  {

        return (int)(time*0.5);

    }
}




