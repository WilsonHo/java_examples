package design.pattern.singleton;

/**
 * Created by baohg on 01/06/2016.
 * http://laptrinh.vn/d/4342-huong-dan-java-design-pattern-singleton.html
 */
public class Database {
    private static final Database INSTANCE = new Database();

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    private String a;
    private Database(){
        a = "hello";
    };

    public static synchronized Database getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Database a = Database.getInstance();
        System.out.println(a.getA());
    }
}


