import java.util.ArrayList;
import java.util.List;

public class Folder implements Directory {
    private int size;
    private List<Directory> childrens;

    

    public Folder() {
        this.size = 0;
        childrens = new ArrayList<>();
    }

    public void add(Directory  component){
        childrens.add(component);
    }

    @Override
    public int getFileSize() {
        for (Directory component : childrens) {
            size += component.getFileSize();
        }
        return size;
    }

}
