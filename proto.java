import java.util.LinkedList;

interface Entry {};

class IntEntry implements Entry {
    private int value;

    IntEntry(int val) {
        value = val;
    }

    public int Int() {
        return value;
    }
}

class StrEntry implements Entry {
    private String value;

    StrEntry(String val) {
        value = val;
    }

    public String Str() {
        return value;
    }
}

class LLElem<T> {
    public T value;
    public LLElem<T> next;
}

public class proto
{
    static String[][] box = new String[10][10];

    public static void main (String[] args)
    {
    //     sample.staticMethod();
        
    //     sample sampleObj = new sample();
    //     sampleObj.instanceMethod();
    //     sampleObj.staticMethod();
    
    //     for(String[] space : proto.box)
    //     {

    //     }

        StrEntry x = new StrEntry("Hello");
        IntEntry y = new IntEntry(7);

        LLElem<Entry> root = new LLElem<Entry>();
        root.value = new StrEntry("Hello");

        LLElem<Entry> el2 = new LLElem<Entry>();
        el2.value = new StrEntry("world");
        root.next = el2;

        LLElem<Entry> el3 = new LLElem<Entry>();
        el3.value = new IntEntry(7);
        el2.next = el3;

        for (LLElem<Entry> currNode = root; currNode != null; currNode = currNode.next) {
            if (currNode.value instanceof StrEntry) {
                System.out.println(((StrEntry)currNode.value).Str());
            } else if (currNode.value instanceof IntEntry) {
                System.out.println(((IntEntry)currNode.value).Int());
            } else {
                System.out.println("Unknown node value");
            }
        }
        System.out.println("\nLinked list below");

        LinkedList<Entry> list = new LinkedList<Entry>();
        System.out.println(list.size());

        list.add(new StrEntry("Foo"));
        list.add(new StrEntry("Bar"));
        list.add(new StrEntry("Bar"));
        System.out.println(list.size());
    }
}

class sample {
    public void instanceMethod()
    {
        System.out.println("instance method called");
    }

    private static void staticMethod()
    {
        System.out.println("static method called");
            
    }
}