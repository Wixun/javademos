class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            int value = getValue(current);

            // Eğer şu andaki değer, bir sonraki değerden küçükse, çıkarma yapılır.
            if (i + 1 < length) {
                char next = s.charAt(i + 1);
                int nextValue = getValue(next);
                if (value < nextValue) {
                    result -= value;
                } else {
                    result += value;
                }
            } else {
                result += value;
            }
        }

        return result;
    }

    // Her Roma rakamının karşılık gelen sayısal değerini döndüren yardımcı metod
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character");
        }
    }
}
