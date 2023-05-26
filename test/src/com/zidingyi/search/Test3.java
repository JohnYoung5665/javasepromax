package com.zidingyi.search;


public class Test3 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                    13, 19, 16, 20,
                    7, 10,
                    43, 50, 48};

        int number = 40;

        Block b1 = new Block(22,40,0,4);
        Block b2 = new Block(13,20,5,8);
        Block b3 = new Block(7,10,9,10);
        Block b4 = new Block(43,50,11,13);

        Block[] blockArr = {b1, b2, b3, b4};

        int index = getIndex(arr, blockArr, number);
        System.out.println(index);
    }

    public static int getIndex(int[] arr, Block[] blockArr, int number) {
        //先要找到number属于哪个块当中的
        int indexBlock = findIndexBlock(blockArr, number);
        //number过大，不在数组当中
        if (indexBlock == -1){
            return -1;
        }
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++){
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int findIndexBlock(Block[] blockArr, int number) {
//        Block b1 = new Block(22,40,0,4);
//        Block b2 = new Block(13,20,5,8);
//        Block b3 = new Block(7,10,9,10);
//        Block b4 = new Block(43,50,11,13);
        for (int i = 0; i < blockArr.length; i++) {
            if (number >= blockArr[i].getMin() && number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}
class Block {
    private int min;
    private int max;
    private int StartIndex;
    private int EndIndex;


    public Block() {
    }

    public Block(int max, int StartIndex, int EndIndex) {
        this.max = max;
        this.StartIndex = StartIndex;
        this.EndIndex = EndIndex;
    }

    public Block(int min, int max, int StartIndex, int EndIndex) {
        this.min = min;
        this.max = max;
        this.StartIndex = StartIndex;
        this.EndIndex = EndIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return StartIndex
     */
    public int getStartIndex() {
        return StartIndex;
    }

    /**
     * 设置
     * @param StartIndex
     */
    public void setStartIndex(int StartIndex) {
        this.StartIndex = StartIndex;
    }

    /**
     * 获取
     * @return EndIndex
     */
    public int getEndIndex() {
        return EndIndex;
    }

    /**
     * 设置
     * @param EndIndex
     */
    public void setEndIndex(int EndIndex) {
        this.EndIndex = EndIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", StartIndex = " + StartIndex + ", EndIndex = " + EndIndex + "}";
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }
}
