package design.pattern.adapter;

import java.util.ArrayList;

/**
 * Created by baohg on 01/06/2016.
 * http://laptrinh.vn/d/4343-huong-dan-java-design-pattern-adapter.html
 * Dùng để tái sử dụng lại những thứ mà trước đây mình đã từng sử dụng.
 */
public class TestAdapter {
    public static void main(String[] args) {
        ShowName show = new ShowName();
        show.showName("abc");


        ArrayList<String> array = new ArrayList<String>();
        array.add(" Teo ");
        array.add(" Ti ");
        array.add(" Ku ");
        ShowListNameAdapter adapter = new ShowListNameAdapter(new ShowName());
        adapter.showListName(array);


        for (String name : array) {
            show.showName(name);
        }
    }


}
