import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // add elements to Stack//

        animals.push("Dog");
        animals.push("Cat");
        animals.push("Tiger");
        animals.push("Lion");
        animals.push("Snake");
        System.out.println("Stack : " + animals);

        // Remove the elements of in the Stack//
        String elements = animals.pop();
        System.out.println("Remove the element : " + elements);

        // access elements from the top//
        String element = animals.peek();
        System.out.println("Animals at top : " + element);
    }
}