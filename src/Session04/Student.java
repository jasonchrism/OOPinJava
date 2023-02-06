package Session04;

public class Student {
    private String id;
    private String name;
    private String className;
    private int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name length is must be between 0 - 20");
        }
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public Student(String name, String className){ // constructor
        id = "" + (long)(Math.random() * 4000000000L);
//        this.name = name;
        setName(name);
        // pakai this saat parameter sama dengan atribut
        this.className = className;
    }
    void study(){
        if (score + 10 < 100){
            score += 10;
        } else {
            score = 100;
        }
        System.out.println("Study " + score);
    }
    void show(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("Score : " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score){
        if (score > 100 || score < 0){
            throw new IllegalArgumentException("Score must be in range 0 - 100");
        }
        this.score = score;
    }

    /* access modifier -> encapsulation (protect)
    *                       class / package / turunan(inheritance) / public
    * public                 X    /    X    /         X            /   X
    * protected              X    /    X    /         X            /
    * package/default        X    /    X    /                      /
    * private                X    /         /                      /

   * setter / getter
   * */
}
class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jason Chrisbellno Mackenzie", "PPTI 16");
        student1.show();
        student1.study();
        student1.study();
        student1.setScore(90);
        student1.show();
    }
}
