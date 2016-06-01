package design.pattern.proxy;

/**
 * Created by baohg on 01/06/2016.
 */
public class UserProxy implements IReadFile {
    private IReadFile instance;
    private String name;

    public UserProxy(String name) {
        this.name = name;
    }

    public String readFile() {
        if (name.equals("ok")) {
            // nêu tên người dùng là ok thì mới thực hiện
            // phương thức của lớp User, không thì báo
            // lỗi! if(instance ==null){
            instance = new User(name);
            return instance.readFile();
        }
        return "You can't read file";
    }
}
