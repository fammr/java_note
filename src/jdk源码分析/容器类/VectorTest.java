package jdk源码分析.容器类;

import java.util.Vector;

/**
 * Created by timeloveboy on 16/8/19.
 */
public class VectorTest {
    public static void main(String[] args){
        Vector<Integer> integers=new Vector<Integer>();
        integers.add(0);
        Vector<Integer> integers2=integers;
        integers2.add(1);

        System.out.println();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
