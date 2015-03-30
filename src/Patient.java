/**
 * Created by mayank on 3/30/2015.
 */
public class Patient {
    private  String name;
    private int age;
    private  double height, weight;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDetails(double height,double weight){
        this.height = height;
        this.weight = weight;
    }
    public double getBMI(){
        double BMI = weight/height;
        return BMI;
    }
}
