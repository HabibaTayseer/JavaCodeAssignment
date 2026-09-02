package Session6;

public class TextProcessor {
    static void main() {
        //countAndPrintWords ("I love Route Academy");
        //reverseText("Ahmed");
        //addSpaces("ILoveRouteAcademy");

        String s1 ="Ahmed";
        String s2 ="Ahmed";
        String s3=new String ("Ahmed");
        String s4=new String ("Ahmed");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2);        //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1==s3);        //false
        System.out.println(s3.equals(s4)); //true
        System.out.println(s3==s4);        //false



    }
    //Count and print words
    //split method
//    public static void countAndPrintWords(String text){
//        String[]words = text.split(" "); //kol space yefsl "delimiter"
//     System.out.println("your text contains "+words.length+" words");
//        System.out.println(String.format("Your text contains %d words ",words.length));
//        for(String word:words){
//            System.out.println(word);
//        }
//    }
//    //Reverse the text and print it
      //charAt method
//    public static void reverseText(String text){
//        String reversed ="";
//       for (int i= text.length()-1 ; i>=0 ;i--){
//          // System.out.print(text.charAt(i));
//           reversed= reversed+text.charAt(i);
//       }
//        System.out.print(reversed);
//    }


//Methods Take string and add spaces to it
//         public static void addSpaces(String text){
//             StringBuilder modifiedText = new StringBuilder(text);
//             for (int i=1 ;i<modifiedText.length() ;i++){
//                if (Character.isUpperCase(modifiedText.charAt(i))){
//                    modifiedText.insert(i," ");
//                    i++;
//                }
//             }
//             System.out.print(modifiedText);
//    }

}
