
public class Book implements Comparable<Book> {
    String name;
    String author_name;
    Book(){
        name=" ";
        author_name=" ";
    }
    @Override
    public String toString(){
        return name + " "+author_name;
    }

    Book(String n1, String n2){
        name=n1;
        author_name=n2;
    }
    void output(){
        System.out.println(name+"   "+author_name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor_name(String author_name){
        this.author_name=author_name;
    }
    public String getAuthor_name(){
        return author_name;
    }
    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }

}
