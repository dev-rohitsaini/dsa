package Tree;

public class Trees {
        class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        static int idx=-1;
        public Node buildTree(int[] values){
            idx++;
            if(idx == -1){
                return null;
            }
            Node newNode = new Node(values[idx]);
            newNode.left = buildTree(values);
            newNode.right = buildTree(values);
            return newNode;
        }
    public static void main(String[]  args){
            int[] nodeValues = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            

    }
}
