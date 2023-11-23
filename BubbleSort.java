/*
 * 冒泡排序
 * 从小到大
 * 从大到小
 */
public class BubbleSort {

    public static void main(String[] args) {
        int nums[] ={24, 69, 80, 57, 13};
        // 从小大排列
        // 先找最小的放前面
        // for(int i = 0; i < nums.length; i++){
        //     int temp = 0;
        //     for(int j = i +1 ;j < nums.length; j++){
        //         if(nums[i] > nums[j]){
        //             temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }

        // 先找最大的放后面
        // for(int i = 0; i < nums.length - 1; i++){
        //     int temp = 0;
        //     for(int j = 0 ;j < nums.length -i - 1; j++){
        //         if(nums[j] > nums[j + 1]){
        //             temp = nums[j + 1];
        //             nums[j + 1] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        // 2.从大到小排列
        // 先找最大的放前面
        // for(int i = 0; i < nums.length; i++){
        //     int temp = 0;
        //     for(int j = i +1 ;j < nums.length; j++){
        //         if(nums[i] < nums[j]){
        //             temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }

        // 先找最小的放后面
        for(int i = 0; i < nums.length -1; i++){
            int temp = 0;
            for(int j = 0 ;j < nums.length -1 - i; j++){
                if(nums[j] < nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    
}
