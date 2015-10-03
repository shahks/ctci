class Node
{
  int data;
  Node left;
  Node right;

  Node(int data)
  {
    this.data = data;
    left = null;
    right = null;
  }

  int getData()
  {
    return data;
  }
  void setData(int x)
  {
    data=x;
  }
}
