class NumberOfOneBits {
    public static int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if (getBit(n, i) == true) {
                count++;
            }
        }

        return count;
    }

    public boolean getBit(int n, int i) {
        return (n &(1 << i)) != 0;
    }

    public static void main(String[] args) {
        hammingWeight(00000011011101001110110111011101);
    }
}