import java.util.Stack;

public class BasicsStack {
    /*
     * Basics of everything I need to know about stacks.
     * Stacks are LIFO - last in first out. 
     * 5 main functions of stacks: push(Object e) -> pushes object e onto the top of the stack.
     *                             pop() -> removes the element at the top of the stack.
     *                             empty() -> returns true if the stack is empty, false if not.
     *                             peek() -> returns the top most element of the stack.
     *                             search(Object e) -> searches for element e in the stack.
     */

    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("NBA 2K24");
        stack.push("GTA V");
        stack.push("GTA IV");
        stack.push("Madden NFL 24");

        System.out.println(stack.peek());
    }



}
