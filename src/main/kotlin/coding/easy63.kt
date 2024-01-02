package coding

/**
 * https://leetcode.com/problems/remove-element/submissions/
 * */

fun removeElement(nums: IntArray, value: Int): Int {
    var sum = 0
    var index = 0
    for (i in nums){
        if (i == value) continue
        sum++
        nums[index] = i
        index++
    }
    return sum
}