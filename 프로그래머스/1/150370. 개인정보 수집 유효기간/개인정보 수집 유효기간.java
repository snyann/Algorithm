import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : terms){
            map.put(s.substring(0,1), Integer.parseInt(s.substring(2)));
        }
        for(int i=0; i< privacies.length; i++){
            int year=Integer.parseInt(privacies[i].substring(0,4));
            int month=Integer.parseInt(privacies[i].substring(5,7));
            int day=Integer.parseInt(privacies[i].substring(8,10));
            month+=map.getOrDefault(privacies[i].substring(11),0);
            day-=1;
            while (month > 12 || day > 28) {
                if (month > 12) {
                    month -= 12;
                    year++;
                }
                if (day > 28) {
                    day -= 28;
                }
            }
            String sMonth=String.valueOf(month);
            if(sMonth.length()==1) sMonth="0"+sMonth;
            String sDay=String.valueOf(day);
            if(sDay.length()==1) sDay="0"+sDay;
            
            String date=String.valueOf(year)+sMonth+sDay;
            
            if(Integer.parseInt(today.replace(".",""))>Integer.parseInt(date)){
                list.add(i+1);
            }
        }
        Collections.sort(list);
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}