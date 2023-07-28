class PrivateDemo{
        private PrivateDemo(){}
        void printer(){
                System.out.println("Printer method1");
        }
        static PrivateDemo getInstance(){
                PrivateDemo pd=new PrivateDemo();
                return pd;
        }
}
class main{
        public static void main(String[] args){
                PrivateDemo pd=PrivateDemo.getInstance();
                pd.printer();
        }
}
