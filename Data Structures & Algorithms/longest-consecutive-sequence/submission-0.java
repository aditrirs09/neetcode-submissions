class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset =  new HashSet<>();
        int longest =0;
        for(int n:nums)
        {
            numset.add(n);
        }
        for(int num:numset)
        {
            if(!numset.contains(num-1))
            {
                int length=1;
                while(numset.contains(num+length))
                {
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
