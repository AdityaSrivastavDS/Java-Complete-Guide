class concatenation{
    public static void main(String args[]){
        String firstname =  "Aditya";
        String lastname = "Srivastav";

        String fullname = firstname + " " + lastname;
        System.out.println(fullname.length());

        //charAt() method is used to get the character at the specified index
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}