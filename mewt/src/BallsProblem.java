public class BallsProblem {
    public static void main(String[] args) {
       int blackN = 3;
       int blueN = 4;
       int redN = 3;
       double blackW = 0.25;
       double blueW = 0.5;
       double redW = 0.75;
       double m = 4;
       int blackCount = 0;
       int blueCount = 0;
       int redCount = 0;
       while(m != 0){
           if(m >= redW && redN > 0){
               redCount++;
               m = m - redW;
               redN--;
           }
           else if(m >= blueW && blueN > 0){
               blueCount++;
               m = m - blueW;
               blueN--;
           }
           else if(m >= blackW && blackN > 0){
               blackCount++;
               m = m - blackW;
               blackN--;
           }
       }
       System.out.println(redCount+" red, "  + blueCount+" blue, " + blackCount + " black.");
    }
}
