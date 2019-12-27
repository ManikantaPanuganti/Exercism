class DnDCharacter {
    int strength,dexterity,constitution,intelligence,wisdom,charisma,hitpoints=0;
    DnDCharacter(){
        strength=ability();
        dexterity=ability();
        constitution=ability();
        intelligence=ability();
        wisdom=ability();
        charisma=ability();
        hitpoints=10+modifier(constitution);

    }
    int roll(){
      return ((int)Math.random()*5)+1;
    }
    int ability() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int a,b,c,d;
        a=roll();
        b=roll();
        c=roll();
        d=roll();
// Here i need to find out 3 rollings out of 4 which are maximum but i'm just considering first 3    
        return a+b+c;

    }

    int modifier(int input) {
        return (int)-Math.round(-(input-10)/2.0);
    }

    int getStrength() {
      //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      return strength;
    }

    int getDexterity() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return dexterity;
    }

    int getConstitution() {
      //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      return constitution;
    }

    int getIntelligence() {
      //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      return intelligence;
    }

    int getWisdom() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return wisdom;
    }

    int getCharisma() {
      //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
      return charisma;

    }

    int getHitpoints() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return hitpoints;
    }

}
