public class Person {
    String name;
    int age;
    char gender;
    int phoneNumber;
    public void getInfo(Person[]array){
        int counterM=0;
        int counterF=0;
        for (Person p : array) {
            if (p.gender == 'm') counterM++;
            else counterF++;
        }
        System.out.println("Male :"+counterM);
        System.out.println("Female :"+counterF);

    }

}
