import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(solveMeFirst(a,b));
    }
    static int solveMeFirst(int a,int b){
        return a+b;
    }
}
