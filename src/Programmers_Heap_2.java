import java.util.PriorityQueue;

public class Programmers_Heap_2{
    class Stock implements Comparable<Stock>{
        Integer stock;

        private Stock(Integer stock){
            this.stock = stock;
        }

        @Override
        public int compareTo (Stock targetStock){
            return this.stock <= targetStock.stock ? 1 : -1;
        }
    }

    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int day = 0;
        int index = 0;

        PriorityQueue<Stock> stockPriorityQueue = new PriorityQueue<>();

        for(;stock < k;){
            k -= stock;
            day += stock;
            stockPriorityQueue = OfferStock(stockPriorityQueue, dates, supplies, day, index);
            stock = 0;
            stock += stockPriorityQueue.poll().stock;
            index = SetIndex(day, dates, index);
            ++answer;
        }

        return answer;
    }

    public PriorityQueue<Stock> OfferStock(PriorityQueue<Stock> stockPriorityQueue, int[] dates, int[] supplies, int day, int index){
        for(int size = dates.length; index < size ; ){
            if(dates[index] <= day){
                stockPriorityQueue.offer(new Stock(supplies[index]));
                ++index;
            }
            else{
                break;
            }
        }

        return stockPriorityQueue;
    }

    public int SetIndex (int day, int[] dates, int index){
        for(int size = dates.length;index < size; ){
            if(dates[index] <= day){
                ++index;
            }
            else{
                break;
            }
        }

        return index;
    }
}
