
package lab04;

import java.util.ArrayList;
import java.util.Collections;


public class CounterList{

	private ArrayList<Counter> indexableList ;


    public CounterList(){
    	indexableList = new ArrayList<Counter>() ;

    }
    void add(){
        indexableList.add(new Counter());

    }
    int size(){
        return indexableList.size();

    }
    void remove(int i){
        indexableList.remove(i);
    }
    void clear(){
        indexableList.clear();

    }
    void click(int i){
        indexableList.get(i).click();
    }
    void reset(int i){
    	indexableList.get(i).reset();
    }
    int getValue(int i) {
    	return indexableList.get(i).getValue();
    }
    public String toString(int i) {
    	return indexableList.get(i).toString();
    }
    public String toString() {
        return(indexableList).toString() ;

    }
    void sort() {
    	Collections.sort(indexableList);
    	
    }



}

