public class Test2 {
    public static void main() {
        Student student=new Student() {
            @Override
            public String getbio(String name) {
                return  name +" is a Engineering student";
            }


        };
        String bio= student.getbio("Rohit");
        System.out.println(bio);
    }
}
