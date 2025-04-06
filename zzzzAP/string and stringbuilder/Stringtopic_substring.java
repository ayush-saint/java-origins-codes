//substring - when you have to take a small part of string 

public class Stringtopic_substring{
    public static void main(String[] args){
        String name = "my name is ayush";
        
        //(.substring(Starting,end)
        //it takes it starts counting from zero and ends at given end minus one 
        String naming = name.substring(3,16);
        System.out.println(naming);

    }
}