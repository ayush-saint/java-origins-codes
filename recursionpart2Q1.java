//tower of hanoi 

/*
The Tower of Hanoi is a classic recursion problem.

Question in Short:
There are 3 rods and n disks of different sizes stacked on one rod (largest at the bottom).
The goal is to move all disks to another rod, following these rules:
_Only one disk can be moved at a time.
_A larger disk cannot be placed on a smaller disk.
_Use the third rod as an auxiliary. 
*/

public class recursionpart2Q1{
    public static void main(String[] args){
        int n = 3;
        towerofhanoi(n, "source", "helper", "destination");
    }
    public static void towerofhanoi(int n ,String src , String help , String desti){
        if(n ==1){
            System.out.println("the disk "+n+" will go from "+src+" to "+desti);
            return;
        }
        towerofhanoi(n-1,src,desti,help);
        System.out.println("the disk "+n+" will go from "+src+" to "+desti);
        towerofhanoi(n-1,help,src,desti);

    }
}