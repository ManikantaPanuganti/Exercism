class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder s=new StringBuilder(inputString);
        return new String(s.reverse());
    }

}
