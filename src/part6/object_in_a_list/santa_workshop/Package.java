package part6.object_in_a_list.santa_workshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftLists;

    public Package(){
        this.giftLists = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.giftLists.add(gift);
    }

    public int totalWeight(){
        if(this.giftLists.size() < 1){
            return -1;
        }
        int total = 0;
        for(Gift list : giftLists){
                total += list.getWeight();
        }
        return total;
    }
}
