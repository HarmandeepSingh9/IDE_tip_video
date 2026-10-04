public class test {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            int current = i / 3;
            if(current % 2 == 0){
                System.out.println("Number: " + current + "!");
            }else{
                System.out.println(false);

            }
        }
    }
}
