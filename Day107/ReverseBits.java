public class ReverseBits {
    public int reverseBits(int n) {
        int res =0;
        for(int i =0;i<32;i++) {
            /*this is used to find least significant digit (lsb)
            00000010100101000001111010011100 & 1 = 00000010100101000001111010011100<- lsb =0 */
            int lsb = n & 1;

            // soo, left shift of lsb lsb<<(31-i) so our 1st position zero will swaped with 31-i.so on...

            int revLsb = lsb<<(31-i);
           // store the revLsb in our result variable 
            res = res|revLsb;
            // right sift of n , one time ans soo on...
            n= n>>1;
        }
        return res;
    }
}






// public class Solution {
    
//     public int reverseBits(int num) {
        
//         num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
//         num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
//         num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
//         num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
//         num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);
        
//         return num;
        
//     }
// }

//https://leetcode.com/problems/reverse-bits/
