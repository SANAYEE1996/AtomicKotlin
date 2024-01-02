package coding

/**
 * https://leetcode.com/problems/remove-element/submissions/
 * */

fun removeElement(nums: IntArray, value: Int): Int {
    val c = nums.filter { it != value }
    for ((a, b) in c.withIndex()) { nums[a] = b }
    return c.size
}