package Teams.day6;

public class University {
    private static int studententrolled = 0;
    private String name;
    private  int id ;

    public University (String name , int id){
        this.name = name;
        this.id = id;
        studententrolled++;
    }
    public static int getStudententrolled(){
        return studententrolled;
    }

    public class course{
        private static  int courseoffered = 0;
        private String title;
        private String code;

        public course(String title , String code){
            this.title = title;
            this.code = code;
            courseoffered++;
        }
        public static int getCourseoffered(){
            return studententrolled;
        }
    }
}
