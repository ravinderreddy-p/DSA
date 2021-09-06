public class ConvertStringToNumber {
    public static void main(String args[]){
        String str = "one, two,three,four";
//        Substring, split, trim
        String[] strArray = str.split(",");
        for(int i = 0; i < strArray.length; i++){
            System.out.print(convertToNumber(strArray[i].trim()));

        }
    }

    private static int convertToNumber(String s) {
        switch(s){
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
        }
        return -1;

    }
}
