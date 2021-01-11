class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var zeroPosition = m

        nums2.forEachIndexed { index, i ->
            if (nums1[zeroPosition] == 0) {
                nums1[zeroPosition] = i
            }
            zeroPosition++

        }

        nums1.sort()
    }
}