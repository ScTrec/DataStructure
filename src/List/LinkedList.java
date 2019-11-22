package List;

public class LinkedList<E> {

    public class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e=e;
            this.next=next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }

    }


    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size =0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //在链表的index(0-based)位置添加新元素e
    //不常用(练习用)
    public void add(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
//        Node node =new Node(e);
//        node.next=prev.next;
//        prev.next=node;
        prev.next=new Node(e,prev.next);
        size++;
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void AddLast(E e){
        add(size,e);
    }

    //在链表的index(0-based)查找元素
    //不常用(练习用)
    public E get(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFisrt(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        cur.e=e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur =dummyHead.next;
        while(cur != null){
            res.append(cur+"->");
            cur=cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

}
