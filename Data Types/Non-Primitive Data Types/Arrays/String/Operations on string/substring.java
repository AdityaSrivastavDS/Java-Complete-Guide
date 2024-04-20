class substring {
    public static void main(String args[]){
        String sentence = "My name is Aditya";

        //substring() method is used to get the substring from the string
        //it takes two parameters 1st is the starting index and 2nd is the ending index
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
