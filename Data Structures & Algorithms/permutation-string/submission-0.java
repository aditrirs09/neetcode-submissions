class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
    int n1 = s1.length(), n2 = s2.length();
    if (n1 > n2) return false;

    int[] diff = new int[26];
    for (int i = 0; i < n1; i++) {
        diff[s1.charAt(i) - 'a']++;
        diff[s2.charAt(i) - 'a']--;
    }

    int mismatches = 0;
    for (int d : diff) if (d != 0) mismatches++;
    if (mismatches == 0) return true;

    for (int i = n1; i < n2; i++) {
        int add = s2.charAt(i) - 'a';
        int remove = s2.charAt(i - n1) - 'a';

        diff[add]--;
        if (diff[add] == 0) mismatches--;
        else if (diff[add] == -1) mismatches++;

        diff[remove]++;
        if (diff[remove] == 0) mismatches--;
        else if (diff[remove] == 1) mismatches++;

        if (mismatches == 0) return true;
    }
    return false;

    }
}
