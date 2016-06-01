package design.pattern.adapter;

import java.util.List;

/**
 * Created by baohg on 01/06/2016.
 */
public class ShowListNameAdapter implements IShowListName {
    private ShowName shownName;

    public ShowListNameAdapter(ShowName shownName) {
        this.shownName = shownName;
    }

    public void showListName(List<String> listName) {
        for (String name : listName) {
            shownName.showName(name);
        }
    }
}
