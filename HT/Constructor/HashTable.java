package HT.Constructor;

public class HashTable {
    int size = 7;
    Node[] dataMap = new Node[size];
    
    class Node {
        String key;
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

}