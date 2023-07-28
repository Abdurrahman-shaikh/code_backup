class PrivateDemo{
        private PrivateDemo(){}
        void printer(){
                System.out.println("Printer method");
        }
        static PrivateDemo getInstance(){
                PrivateDemo pd=new PrivateDemo();
                return pd;
        }
}
class PrivateMain_01{
        public static void main(String[] args){
                PrivateDemo pd=PrivateDemo.getInstance();
                pd.printer();
        }
}
