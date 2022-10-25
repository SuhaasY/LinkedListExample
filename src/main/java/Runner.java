public class Runner {
    public static void main(String[] args) {
        Person m = new Person("Frank", 31);
        Person m2 = new Person("Bill", 28);
        Person m3 = new Person("Lisa", 45);
        Person m4 = new Person("Tina", 22);
        Person m5 = new Person("Kerry", 33);
        LinkedListCustom ll = new LinkedListCustom();
        ll.addToFront(m);
        ll.addToFront(m2);
        ll.addToFront(m3);
        ll.addToFront(m4);
        ll.addToFront(m5);
        System.out.println(ll);
        System.out.println("==================");
        Person removed = (Person) ll.removeFromTail();
        System.out.println(removed);
        System.out.println("==================");
        System.out.println(ll);
    }
}