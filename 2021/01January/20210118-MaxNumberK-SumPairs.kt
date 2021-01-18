class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val mutableNums = nums.toMutableList()
        val claimedIndices = emptyArray<Int>().toMutableList()

        nums.forEachIndexed { index1, num1 ->
            if (index1 in claimedIndices) return@forEachIndexed


            nums.forEachIndexed { index2, num2 ->
                if (index2 in claimedIndices || index1 in claimedIndices) return@forEachIndexed

                if (index1 == index2) return@forEachIndexed

                if (num1 + num2 == k) {
                    mutableNums.remove(index1)
                    claimedIndices.add(index1)

                    mutableNums.remove(index2)
                    claimedIndices.add(index2)
                    return@forEachIndexed
                }
            }
        }
        return claimedIndices.size / 2
    }
}