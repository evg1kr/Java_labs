public class Word implements Comparable<Word> {
    @Override
    public int compareTo(Word o) {
        return name.compareTo(o.name);
    }
    String name;
    int key;
    Word(String t, int k){
        name=t;
        key=k;
    }
    void setName(String k){
        name = k;
    }
    void setKey(int k){
        key=k;
    }
    String getName(){
        return name;
    }
    int getKey(){
        return key;
    }
}
