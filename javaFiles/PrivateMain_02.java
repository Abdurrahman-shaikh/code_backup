class PrivateDemo{
        private PrivateDemo(){}
	static PrivateDemo pd=null;
        void printer(){
                System.out.println("Printer method");
        }
        static PrivateDemo getInstance(){
		if(pd==null){
                	pd=new PrivateDemo();
		}
                return pd;
        }
}
class main{
        public static void main(String[] args){
                PrivateDemo pd=PrivateDemo.getInstance();
                pd.printer();
        }
}
