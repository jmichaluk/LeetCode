// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3599/

class Solution {
    fun createSortedArray(instructions: IntArray): Int {

        val nums = mutableListOf<Int>()
        var cost = 0
        val mod = 1000000007

        instructions.forEach { instruction ->
            var lesserNums = 0
            var greaterNums = 0

            nums.forEach { num ->
                if (num < instruction) {
                    lesserNums++
                } else if (num > instruction) {
                    greaterNums++
                }
            }

            cost += if (lesserNums <= greaterNums) {
                lesserNums
            } else {
                greaterNums
            }

            nums.add(instruction)
        }

        nums.sort()
        return cost * mod
    }
}
