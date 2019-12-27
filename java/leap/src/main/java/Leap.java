class Leap {

    boolean isLeapYear(int year) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if(year%4!=0){
          return false;
        }
        else{
          if(year%100==0){
            if(year%400==0){
              return true;
            }
            else{
              return false;
            }
          }
          else{
            return true;
          }
        }
    }

}
