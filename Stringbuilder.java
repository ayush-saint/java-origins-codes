// using stringbuilder and its operation basic 

public class Stringbuilder{
    public static void main(String[] args){

        //printing StringBuilder
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //printing character ar ubdex 0
        System.out.println(sb.charAt(0));

        //set char at index 0 
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //inserting new character
        sb.insert(2,'n');
        System.out.println(sb);

        //deleting a character or a group of character 
        sb.delete(2,4);
        System.out.println(sb);

        //appending - adding something to the StringBuilder ,always adds word at last 
        sb.append("a");
        sb.append("b");
        System.out.println(sb);

        //printing length of the StringBuilder by .length
        System.out.println(sb.length());


    }
}