package com.code.day;

import com.tool.DKFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class Q_912 {

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int first = low, last = high, key = nums[first];

        while (first < last) {
            while (first < last && nums[last] >= key) {
                --last;
            }
            nums[first] = nums[last];
            while (first < last && nums[first] <= key) {
                ++first;
            }
            nums[last] = nums[first];
        }
        nums[first] = key;
        quickSort(nums, low, first - 1);
        quickSort(nums, first + 1, high);
    }

    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    public int[] sortArray1(int[] nums) {

        boolean isSort = true;
        for (int i = 0; i < nums.length - 1 && isSort; i++) {
            isSort = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    isSort = true;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        Q_912 obj = new Q_912();

        int[] nums = new int[]{5,2,3,1};
        obj.sortArray(nums);
        System.out.println(Arrays.toString(nums));



        DKFile file = new DKFile();

        String path = file.getClass().getResource("sortData.json").getPath();
        String jsonString = file.readJsonFile(path);
        JSONObject jobj = JSONObject.fromObject(jsonString);

        JSONArray arr = jobj.getJSONArray("arr");
        int[] objArr = ArrayUtils.toPrimitive((Integer[]) arr.toArray());
        System.out.println(objArr.length);

        Integer num = (Integer) objArr[10];
        System.out.println(num);

        obj.sortArray(objArr);

        System.out.println(objArr);

    }
}
