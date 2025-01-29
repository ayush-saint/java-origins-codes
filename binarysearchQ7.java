//Question __find the mountain array 
//given an mountain array and an target element print the index of the target element and if the element occurs more than once print the minimum index of that array if the element don't exist return -1

public class binarysearchQ7{
    public static void main(String[] args){
        int[] mountainarr = {1,2,3,4,5,6,7,4,2};
        int target = 2;
        int ans = findthemountainarray(mountainarr,target);
        System.out.println(ans);
    }

    public static int findthemountainarray(int[] mountainarr,int target){
        int n = mountainarr.length;
        
        //step 1 : find the peak element 
        int peakindex = findpeakindex(mountainarr,0,n-1);

        //step 2 : binary search in the ascending part of the array 
        int index = binarysearch(mountainarr,target,0,peakindex,true);
        if(index != -1 ){
            return index;
        }   

        //step 3 : binary search in the descending part of the array
        return binarysearch(mountainarr, target, peakindex+1,n-1, false );
    }

    public static int  findpeakindex(int[] mountainarr,int start , int end){
        while(start < end){
            int mid = start + (end - start)/2;
            if(mountainarr[mid]<mountainarr[mid+1]){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start ;
    }

    public static int binarysearch(int[] mountainarr, int target , int start , int end , boolean ascending ){
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainarr[mid]==target){
                return mid;
            }
            if(ascending){
                if(mountainarr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(mountainarr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}