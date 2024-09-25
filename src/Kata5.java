public class Kata5 {
    public static String pigIt(String str) {
        String res="";
        for(String s : str.split(" ")){
            if(s.equals("!")||s.equals(",")||s.equals(".")||s.equals("?")){
                res+=s+" ";}
            else res+=s.substring(1)+s.charAt(0)+"ay"+" ";
        }
        return res.substring(0,res.length()-1);
    }
    public static String makeReadable(int seconds) {
        //if(seconds==0) return "00:00:00";
        int hour=(int)seconds/3600;
        int minute=(int)((seconds-(hour*3600))/60);
        int sec=(int)(seconds-(minute*60)-(hour*3600));
        String result ="";

        if(hour<10) result+="0"+Integer.toString(hour)+":";
        else result+=Integer.toString(hour)+":";
        if(minute<10) result+="0"+Integer.toString(minute)+":";
        else result+=Integer.toString(minute)+":";
        if(sec<10) result+="0"+Integer.toString(sec);
        else result+=Integer.toString(sec);

        return result;
    }
}
