public class Zad2_Tree {


    public static void main(String[] args) {
            MetodaTree_Do_Zad2.Tree tree = new MetodaTree_Do_Zad2.Tree();
            tree.add(5);
            tree.add(3);
            tree.add(7);
            tree.add(2);
            tree.add(4);
            tree.add(6);
            tree.add(8);
            tree.add(1);
            tree.add(69);

            System.out.println("Contains 4: " + tree.contains(4));
            System.out.println("Contains 9: " + tree.contains(9));
            System.out.println("Contains 7: " + tree.contains(7));

            System.out.println("Min value: " + tree.min());
            System.out.println("Max value: " + tree.max());

        tree.printTree();

    }
}


