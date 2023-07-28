class FactoryMain{
        public static void main(String[] args){
        FactoryDemo fd1=FactoryDemo.getInstance(10);
        FactoryDemo fd2=FactoryDemo.getInstance(10);
        System.out.println(fd1.x);
        System.out.println(fd2.x);
        }
}
