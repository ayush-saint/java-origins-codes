//Question _ search in rotated sorted array 
// you are given a rotated sorted array which was previously sorted and you have to find the index of the target element if not found return -1

public class binarysearchQ8{
    public static void main(String[] args){
        int[] nums= {4,5,6,7,0,1,2};
        int target =0;
        int ans = binarysearch(nums,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target&&target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<target&&target<=nums[end]){
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
