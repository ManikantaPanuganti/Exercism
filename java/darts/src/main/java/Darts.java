class Darts {
    double x,y;
    Darts(double x, double y) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.x=x;
        this.y=y;
    }

    int score() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        double distance=Math.sqrt((x*x)+(y*y));
        if(distance>10){
          return 0;
        }
        else if(distance>5){
          return 1;
        }
        else if (distance>1){
          return 5;
        }
        else
        return 10;
    }

}
