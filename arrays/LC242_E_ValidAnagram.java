public boolean isValidAnagram(String a , String b) {  
    if (a.length() != b.length()) {
        return false;
    }

    int[] counts = new int[26];

    for (char c : a.toCharArray()) {
        int index = c - 'a';
        counts[index]++;
    }

    for (char c : b.toCharArray()) {
        int index = c - 'a';
        counts[index]--;
        if (counts[index] < 0) {
            return false;
        }
    }

    return true;
}
