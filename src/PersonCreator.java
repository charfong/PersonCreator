public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Paterson", 34,180,73.5);
        Person Person02 = new Person("Bob Thornley", 25,171, 68.2);
        Person Person03 = new Person("Luigi Smith", 8, 95, 80.0);
        System.out.println(Person01.getName()+", " + Person01.getAge() + ", " + Person01.getHeight() + ", " + Person01.getWeight() + ", ");
        System.out.println(Person02.getName()+", " + Person02.getAge() + ", " + Person02.getHeight() + ", " + Person02.getWeight() + ", ");
        System.out.println(Person03.getName()+", " + Person03.getAge() + ", " + Person03.getHeight() + ", " + Person03.getWeight() + ", ");
        Person01.growOlder();
        Person02.growOlder();
        Person03.growOlder();
        System.out.println(Person01.getName()+", " + Person01.getAge() + ", " + Person01.getHeight() + ", " + Person01.getWeight() + ", ");
        System.out.println(Person02.getName()+", " + Person02.getAge() + ", " + Person02.getHeight() + ", " + Person02.getWeight() + ", ");
        System.out.println(Person03.getName()+", " + Person03.getAge() + ", " + Person03.getHeight() + ", " + Person03.getWeight() + ", ");
    }



}
