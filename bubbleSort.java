package ArticleManage;

/**
 * @author 王艺博
 * @date 2021/4/11 10:25
 */
public class bubbleSort {
    // 冒泡排序
    public static void main(String[] args) {
        // 定义一个数组,并让这个数组按升序排序
        int[] num = {4,8,3,6,1,7,9};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-i-1; j++) {// // 让当前的值与下一个值对比，如果当前值比下一个值大，两个值就交换位置
                if ( num[j] > num[j+1] ) {
                    int haha = num[j];// 新定义一个临时变量，实现两个数据的交换位置
                    num[j] = num[j+1];
                    num[j+1] = haha;
                }
            }
        }
        // 打印数组
        for ( int n : num ) {
            System.out.print(n + " ");
        }
    }
}
