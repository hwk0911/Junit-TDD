import java.util.*;

public class Programmers_Sort_2 {
    public String solution(int[] numbers) {
        ArrayList<String> strList = new ArrayList<>();

        for(Integer index : numbers){
            strList.add(index.toString());
        }

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        //Collections.sort To lambda
        //Collections.sort(strList, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(strList.get(0).startsWith("0")){
            return "0";
        }

        Iterator<String> strItr = strList.iterator();
        String answer = "";

        while(strItr.hasNext()){
            answer += strItr.next();
        }

        return answer;
    }
}
