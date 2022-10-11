public class Main {
    public static void main(String []args){
        ArrayList arrayList1 = new ArrayList();

        arrayList1.addAtFront("Uno");
        arrayList1.addAtFront("Dos");
        arrayList1.addAtFront("Tres");
        arrayList1.addAtTail("Ultimo");
        arrayList1.remove(2);
        arrayList1.removeAll();
    }
}
