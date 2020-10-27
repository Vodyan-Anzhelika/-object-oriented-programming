/**
 * Hello world!
 */
public class Client {

    public static void main(String[] args) {

        Isort isort = new SortedBubble();
        isort.sort();
        Isort iSortStrLen = new SortedRadix();
        iSortStrLen.sort();
        Isort iSortHash = new SortedQuick();
        iSortHash.sort();
    }
}
