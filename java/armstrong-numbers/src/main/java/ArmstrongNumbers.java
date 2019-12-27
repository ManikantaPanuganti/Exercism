class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		//throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		int dup=numberToCheck;
		int length=0,k,check=0;
		while(dup>0){
			dup=dup/10;
			length++;
		}
		dup=numberToCheck;
		while(dup>0){
			k=dup%10;
			dup/=10;
			check+=Math.pow(k,length);
		}
		return check==numberToCheck;
	}

}
