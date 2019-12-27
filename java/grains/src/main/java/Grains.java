import java.math.BigInteger;
import java.math.BigDecimal;
class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square<1 || square>64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        BigInteger bg=new BigInteger("2");
        bg=bg.pow(square-1);
        return bg;


    }

    BigInteger grainsOnBoard() {

        BigInteger bn = new BigInteger("0");
        for (int i = 1; i <= 64; i++) {
            bn =bn.add(grainsOnSquare(i));
        }
        return bn;
    }

}
