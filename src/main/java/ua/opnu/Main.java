package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Alexander", 2);

        st.addCourse("Mathematics");
        st.addCourse("Programming");
        st.addCourse("Databases");

        System.out.println(st.getName() + ": number of courses - " + st.getCourseCount());
        System.out.println(st.getName() + ": year of study - " + st.getYear());
        System.out.println(st.getName() + ": tuition paid - " + st.getTuition());
    }
}
