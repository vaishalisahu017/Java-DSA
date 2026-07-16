lass Solution {
    public int compress(char[] chars) {
        int poi1 = 0;
        int poi2 = 0;

        while (poi2 < chars.length) {
            char currentChar = chars[poi2];
            int count = 0;
            while (poi2 < chars.length && chars[poi2] == currentChar) {
                poi2++;
                count++;
            }

            chars[poi1++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[poi1++] = c;
                }
            }
        }

        return poi1;
    }
}
