package collections.kit.collections;

public class Employee implements Comparable<Employee>{
    private long id;
    private  String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
        if(id == e.id){
            return 0;
        } else if(id > e.id) {
            return 1;
        }else {
            return -1;
        }
    }
}
