/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Kot
 */
public class PairUtil {

    public static void swap(Pair arg) {
        arg.swap();
    }

    public static void swapAll(Pair[] TableOfPairs) {
        for (Pair temp : TableOfPairs) {
            temp.swap();
        }
    }

    public static <T extends Comparable> Pair minmax(T[] TableOfGenericElements) {
        if (TableOfGenericElements.length == 0) {
            return null;
        }
        T min = TableOfGenericElements[0];
        T max = TableOfGenericElements[0];
        for (T temp : TableOfGenericElements) {
            if (temp.compareTo(max) > 0) {
                max = temp;
            }
            if (temp.compareTo(min) < 0) {
                min = temp;
            }
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {

        //1
        Pair<Integer> pair1 = new Pair(2, 5);
        System.out.print("1: przed zmiana " + pair1.getLeft()+" "+pair1.getRight());
        pair1.swap();
        System.out.println(" po zmianie: " + pair1);
        //2
        System.out.print("2: przed zmiana " + pair1);
        PairUtil.swap(pair1);
        System.out.println(" po zmianie: " + pair1);
        //3
        Pair<Integer> pair2 = new Pair(1, 7);
        Pair<Integer> pair3 = new Pair(3, 6);
        Pair<Integer> pair4 = new Pair(7, 6);
        Pair<Integer>[] TabOfPairs = new Pair[]{pair1, pair2, pair3, pair4};
        System.out.println("3: przed zmiana " + TabOfPairs[0] + " " + TabOfPairs[1] + " " + TabOfPairs[2] + " " + TabOfPairs[3]);
        PairUtil.swapAll(TabOfPairs);
        System.out.println("      po zmiana " + TabOfPairs[0] + " " + TabOfPairs[1] + " " + TabOfPairs[2] + " " + TabOfPairs[3]);
        //4
        Integer[] TabOfInts = new Integer[]{3, 4, 6, 7, 11, 5, 3, 6, 4, 6, 7, 2, 8, 4};
        System.out.print("4: Tablica Intow: ");
        for (Integer ElOfTab : TabOfInts) {
            System.out.print(ElOfTab + " ");
        }
        System.out.println("\n   Para najwiekszych z tablicy intow: " + PairUtil.minmax(TabOfInts));
        //5

    }
}
