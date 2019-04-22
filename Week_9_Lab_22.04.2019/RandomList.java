import java.util.ArrayList;

public class RandomList extends ArrayList {

    public String randomString(){
        if(this.size() == 0)
            return null;

        int index = (int)(Math.random() * this.size());
        return (String)this.get(index);
    }

}
