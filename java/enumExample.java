public class enumExample {
    public enum days {
        MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
    public static void main(String[] args) {
        days d=days.MONDAY;
        String ans=switch(d){
            case MONDAY->"mn";
            case TUESDAY->"tue";
            default->"weekend";
        };
        System.out.println(ans);
    }
    
}
