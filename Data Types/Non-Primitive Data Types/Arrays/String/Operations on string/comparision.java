class comparision {
    public static void main(String args[]){
        String name1 = "Aditya";
        String name2 = "Aditya";

        //compareTo() method is used to compare two strings
        //1st case s1 > s2 : +ve value
        //2nd case s1 < s2 : -ve value
        //3rd case s1 == s2 : 0

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
