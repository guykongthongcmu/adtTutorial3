
//672110545 Virawit Kongthong ADT Tutorial 3

public class studentID {
    public static void main(String[] args) {
        stack studentIDArray = new stack(9);

        int studentID = 672115045;
        String studentIDString = Integer.toString(studentID);

        for (int i = 0; i < 9; i++) {
            studentIDArray.push(Character.getNumericValue(studentIDString.charAt(i)));
        }

        studentIDArray.peek();
        studentIDArray.pop();
        studentIDArray.pop();
        studentIDArray.pop();
    }
}
