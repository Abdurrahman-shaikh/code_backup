interface AdapterInterface1{
        default void show();
        void default printer();
        void default display();
}
class AdapterDemo implements AdapterInterface1{
        public void printer(){
                System.out.println("printer");
        }
}
class MainClass{
        public static void main(String[] args){
                AdapterDemo ac=new AdapterDemo();
                ac.printer();
        }
}
