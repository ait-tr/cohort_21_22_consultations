import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public  class Counter <T >{


    private List<T> list;

    public Counter(List<T> list) {
        this.list = list;
    }

    public Map<T,Integer>  count(){
        Map<T,Integer> res= new HashMap<>();

        for (T p: list){
            res.put(p,res.getOrDefault(p,0) +1);
        }

        return res;
    }


}
