public class Node {
	int value;
    String data;
    private Node link;
	
	
	
    public Node() {
        data = null;
        link = null;
    }

    public Node(String data) {
        this.data = data;
        link = null;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String pcName) {
        this.data = pcName;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
