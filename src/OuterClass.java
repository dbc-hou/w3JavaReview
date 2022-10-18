public class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass myOtherOuter = new OuterClass();
        OuterClass.InnerClass inner = myOtherOuter.new InnerClass();
        System.out.println(inner.myInnerMethod());
    }

}
