package OOPS;

public class Animal {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String  getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age<0){
            age=0;
        }
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
