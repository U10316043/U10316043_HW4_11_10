import java.util.*;

public class testmystack{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		stack object = new stack();
		for(int i = 1;i<=5;i++){
			System.out.print("Please input a string: ");
			String a = input.next();
			object.push(a);
		}
		while(!object.isEmpty()){
			System.out.print(object.pop()+" ");
		}
	}
}

class stack extends MyStack{
  private ArrayList<Object> list = new ArrayList<Object>();

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public int getSize() {
    return list.size();
  }

  @Override
  public Object peek() {
    return list.get(getSize() - 1);
  }

  @Override
  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  @Override
  public void push(Object o) {
    list.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}

class MyStack {
  private ArrayList<Object> list = new ArrayList<Object>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }

  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}
