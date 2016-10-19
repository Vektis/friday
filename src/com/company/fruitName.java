package com.company;

/**
 * Created by vr834 on 10/19/16.
 */
public class fruitName {
    String f;
        public fruitName(String x) {
            f = x.toLowerCase();
        }
        public int calCount(){
        if (f.equals("apple")){
            return 95;
        }
        else if(f.equals("banana")){
            return 105;
        }
        else if(f.equals("orange")){
            return 45;

        }
        else if(f.equals("pear")) {
            return 102;
        }
            else {
            return 0;
        }
    }
}
