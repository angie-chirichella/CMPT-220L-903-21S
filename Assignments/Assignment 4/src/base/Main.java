package base;

public class Main {

    public static void main(String[] args) {
        int[] list_1 ={2,3,2,4,5,6,10};
        System.out.println(summation(list_1));
    }
    static int summation(int[] givenlist){
        int length1 = givenlist.length;
        int totalamount = 0;
        for(int i = 0; i<length1; i++)
            totalamount += givenlist[i];
        return totalamount;
    }
}
