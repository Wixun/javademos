import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }

        int n = x;

        int reserved = 0;

        while(n > 0)
        {
           int d = n % 10;

           reserved = (reserved * 10) + d;

           n = n/10;
        }

        if(reserved == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
