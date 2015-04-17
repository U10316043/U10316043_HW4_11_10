import java.util.*;

public class testmystack{
	/**Main method*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);// Scanner
		stack object = new stack();//new an object
		for(int i = 1;i<=5;i++){
			System.out.print("Please input a string: ");
			String a = input.next();//create a
			object.push(a);//invoke method push
		}
		while(!object.isEmpty()){
			System.out.print(object.pop()+" ");//print and invoke method
		}
	}
}

class stack extends ArrayList<Object>{
	//method
  public boolean isEmpty() {
    return super.isEmpty();
  }


  public int getSize() {
    return super.size();
  }


  public Object peek() {
    return super.get(getSize() - 1);
  }


  public Object pop() {
    Object o = super.get(getSize() - 1);
    super.remove(getSize() - 1);
    return o;
  }


  public Object push(Object o) {
    return super.add(o);	
  }
  
  @Override /** Override the toString in the Object class */
  public String toString() {
  return "stack: " + super.toString();
  }
}
