
package lab04;
    public class Counter implements Comparable<Counter>{
        private int valueOfTheCounter;
        
        public Counter(){
        
        }
        void click(){
            valueOfTheCounter ++;
        
        }
        void reset(){
            valueOfTheCounter = 0;
        }
        int getValue(){
            return valueOfTheCounter;
        }
        public String toString(){
            return Integer.toString(valueOfTheCounter);
        
        }
		public int compareTo(Counter i) {

			if(valueOfTheCounter == i.valueOfTheCounter)return 0 ;
			else if (valueOfTheCounter>i.valueOfTheCounter)return 1;
			else return -1;
		}

    }



