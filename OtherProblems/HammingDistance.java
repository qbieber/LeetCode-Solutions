class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }

    public static void main(String[] args) {
        System.out.print(hammingDistance(5, 8));
    }
}