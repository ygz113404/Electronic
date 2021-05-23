

public class LinkedList {

Node head;
    Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }

    public void insertAtFront(String itemName)
    {
        if(isEmpty())
            first = last = new Node(itemName, first);
        else
            first = new Node(itemName, first);
    }

    public boolean removeFromFront()
    {
        if(isEmpty())
        {
            System.out.println();
            return false;
        }
        else
        {
            if(first == last)
                first = last = null;
            else
                first = first.getLink();
            return true;
        }
    }

    public void insertAtBack(String itemName)
    {
        if(isEmpty())
            first = last = new Node(itemName, first);
        else
        {
            last.setLink(new Node(itemName));
            last = last.getLink();
        }
    }

    public boolean removeFromBack(){
        if(isEmpty()){
            System.out.println();
            return false;
        }
        else{
            if(first == last)
                first = last = null;
            else{
                Node current = first;
                while(current.getLink() != last)
                    current = current.getLink();
                last = current;
                current.setLink(null);
            }
            return true;
        }
    }

    public int size()
    {
        int count = 0;
        Node current = first;

        while (current != null)
        {
            count++;
            current = current.getLink( );
        }
        return count;
    }

    public void outputList()
    {
        Node current = first;
        while (current != null)
        {
            System.out.println(current.getData( ));
            current = current.getLink( );
        }
    }

    private Node find(String target)
    {
        Node position = first;
        String itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.getData( );
            if (itemAtPosition.equals(target))
                return position;
            position = position.getLink( );
        }
        return null;
    }


    public String sendStringToGUI(int i)
    {
        Node current = first;
        int pos = 0;
        while (current != null && pos<i)
        {
            //System.out.println(current.getData( ));
            current = current.getLink( );
            pos+=1;
        }
        System.out.println("What is cur pos: "+pos);
        return current.getData();
    }

    public boolean contains(String item)
    {
        return (find(item) != null);
    }



}
