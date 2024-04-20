//revserse a string without using revserse function

class ques4 {
    public static void main(String args[]){
        String name = "Aditya";

        for(int i=name.length(); i>0; i--){
            System.out.print(name.charAt(i-1));
        }
    }
}
