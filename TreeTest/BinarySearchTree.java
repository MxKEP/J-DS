package TreeTest;

public class BinarySearchTree extends BinaryTree
{
    @Override
    public void insert(Comparable item)
    {
        TreeNode q;

        if (getRoot() == null)
            setRoot(new TreeNode(item));
        else
        {
            TreeNode p = null;
            q = getRoot();
            while (q != null)
            {
                p = q;
                if (item.compareTo(p.getValue()) < 0)
                    q = p.getLeft();
                else
                    p.getRight();
            }
           if (item.compareTo(p.getValue()) < 0)
                p.setLeft(new TreeNode(item));
            else
                p.setRight(new TreeNode(item));
        }
    }

    // INSERT AN ITEM IN BinarySearchTree
    public void insertRecurs(Comparable item)
    {
        setRoot(recurInsert(getRoot(), item));
    }
    @Override
    public TreeNode find(Comparable key)
    {
        TreeNode p = getRoot();
        while (p != null && key.compareTo(p.getValue()) != 0)
        {
            if (key.compareTo(p.getValue()) < 0)
                p = p.getLeft();
            else
                p = p.getRight();
        }
        return p;
    }

    /*
        -Private helmper method
        -Finds insertion point for new node and attaches it.
        -Returns reference to TreeNode along insertion path
     */
    private TreeNode recurInsert(TreeNode t, Comparable item)
    {
        if (t == null)
            return new TreeNode(item);
        else if (item.compareTo(t.getValue()) < 0 )
            t.setLeft(recurInsert(t.getLeft(), item));
        else
            t.setRight(recurInsert(t.getRight(), item));
        return t;
    }

}
