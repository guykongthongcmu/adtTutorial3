
//672110545 Virawit Kongthong ADT Tutorial 3

public class studentID {
    public static void main(String[] args) {
        stack studentIDArray = new stack(7);

        studentIDArray.push(new studentClass("100", "Joe", "2.5"));
        studentIDArray.push(new studentClass("103", "John", "3.0"));
        studentIDArray.push(new studentClass("102", "James", "2.3"));
        studentIDArray.push(new studentClass("120", "Louis", "1.4"));
        studentIDArray.push(new studentClass("105", "Henry", "2.8"));
        studentIDArray.push(new studentClass("109", "Kevin", "1.8"));
        studentIDArray.push(new studentClass("110", "Hank", "4.0"));


        System.out.println("Element at top is " + studentIDArray.peek());

        for (int i = 0; i < 3; i++) {
            System.out.println("Popped " + studentIDArray.pop());
        }

        System.out.println("Stack size is " + studentIDArray.max());
    }
}
