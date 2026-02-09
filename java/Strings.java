public class Strings {
    public static void main(String[] args) {
        // String is a sequence of character
        // String name= "Rohit";
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.charAt(3));
        // String names1="Rohit1";
        // System.out.println(name.equals(names1));
        // String names2= "rohit";
        // System.out.println(name.equalsIgnoreCase(names2));
        // System.out.println(name.compareTo(names2));
        // System.out.println(name.compareToIgnoreCase(names2));
        String name="Rohit Kumar Choubey";
        System.out.println(name.substring(0,5));// end index is excluding
        String newName=name.replace("Kumar"," ");
       
        System.out.println(name);
        
        System.out.println(newName);
        System.out.println(name.contains("mar"));
        System.out.println(name.startsWith("Ro"));
        System.out.println(name.endsWith("ey"));
        String a="";
        String b="  ";
        System.out.println(a.isBlank());
        System.out.println(b.isBlank());
        System.out.println(a.isEmpty());
        System.out.println(b.isEmpty());
    }
    
}
