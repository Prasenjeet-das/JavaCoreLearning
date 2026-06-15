public class Demo{
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();
        al.add(1);
        al.add("XYZ");
        al.add('A');
        al.add(true);
        al.add(53.2);
        al.add(9608212323l);
        al.add(1);
        al.add(null);
        System.out.println(al);
        al.remove(53.2);
        System.out.println(al);
        al.add(4, 53.2);
        System.out.println(al);
        al.set(6,"vishal");
        System.out.println(al);
        al.remove(8);
        System.out.println(al);
        System.out.println(al.contains("null"));
        System.out.println(al.contains(2));
        System.out.println(al.get(7));
        al.clear();
        System.out.println(al.isEmpty());
        

    }
  }

  

