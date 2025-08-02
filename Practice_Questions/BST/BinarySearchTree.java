package Practice_Questions.BST;

public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BinarySearchTree(int[] arr){
        root = CreateTree(arr,0,arr.length-1);
    }

    private Node CreateTree(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateTree(arr,si,mid-1);
        nn.right = CreateTree(arr, mid+1, ei);
        return nn;

    }
    public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn==null) {
			return;
		}
		String str = "<--"+ nn.val + "-->";
		if(nn.left != null) {
			str = nn.left.val+str;
		}else {
			str = "."+str;
		}
		if(nn.right != null) {
			str = str+nn.right.val;
		}else {
			str = str+".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        BinarySearchTree bst = new BinarySearchTree(arr);
        bst.Display();
    }
}
