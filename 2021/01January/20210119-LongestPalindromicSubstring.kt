class Solution {
    fun longestPalindrome(s: String): String {

        for (palindromeLength in s.length downTo 1) {

            for(startPosition in 0..(s.length-palindromeLength)) {
                val segment = s.substring(startPosition, (startPosition + palindromeLength))
                if (checkPalindrome(segment)) {
                    return segment
                }
            }
        }
        return s.toCharArray().first().toString()
    }

    private fun checkPalindrome(s: String): Boolean {
        return s == s.reversed()
    }
}