//soem topic of string

public class Stringtopic{
    public static void main(String[] args){

        //concatenation-adding of two strings
        String name = "tony ";
        String title = "stark";
        String fullname = name + title ;
        System.out.println(fullname);

        //.length-gave count of the full character of the sentence 
        System.out.println(fullname.length());

        //charAt-deals with the each single character 
        for(int i=0 ;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

    }
}