class FactoryDemo{
        int x;
        static FactoryDemo fd=null;
        private FactoryDemo(int a){
        x=a;
        }
        public static FactoryDemo getInstance(int k){
                if(fd==null){
                        fd=new FactoryDemo(k);
                }
                return fd;
        }
}
class Constructor_06{
        public static void main(String[] args){
        FactoryDemo fd1=FactoryDemo.getInstance(10);
        FactoryDemo fd2=FactoryDemo.getInstance(10);
        System.out.println(fd1.x);
        System.out.println(fd2.x);
        }
}

