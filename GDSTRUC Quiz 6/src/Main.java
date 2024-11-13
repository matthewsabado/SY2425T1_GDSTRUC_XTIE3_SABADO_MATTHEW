//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(100);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        System.out.println("Ascending order: ");
        tree.traverseInOrder();
        System.out.println(" ");
        System.out.println("Descending order: ");
        tree.traverseInOrderDescending();
        System.out.println(" ");
        System.out.println("Minimum Value: " + tree.getMin());
        System.out.println("Maximum Value: " + tree.getMax());

        }
    }
