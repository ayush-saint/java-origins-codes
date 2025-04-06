//search the character in the String(linear search algo)

public class linearsearchQ1{
    public static void main(String[] args){
        String name = "Ayushkumarsingh";
        char letter = 'y';
        int ans = StringLinearSearch(name,letter);
        System.out.println(ans);


    }
    public static int StringLinearSearch(String name,char letter){
        if(name.length() == 0){
            return -1;
        }
        for(int index = 0 ; index<name.length() ; index++){
            char character = name.charAt(index);
            if(character ==letter){
                return index;
            }
        }
        return -1;
    }
}