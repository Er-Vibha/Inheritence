class Address {
    String city, state, country;
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
    public class Aggergation {
        String name;
        int age;
        Address address; //aggregation
        Aggergation(String name, int age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        void display() {
            System.out.print(name + " " + age+ " ");
            System.out.println(address.city+" "+address.state+" "+address.country);
        }
        public static void main(String[] args) {
            Address obj = new Address("Noida", "Up", "India");
            Aggergation ob1=new Aggergation("Sita",19,obj);
            ob1.display();
        }
    }
