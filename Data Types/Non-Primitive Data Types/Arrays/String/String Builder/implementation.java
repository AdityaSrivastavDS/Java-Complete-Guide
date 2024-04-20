class implementation{
    public static void main(String args[]){

        // String Builder is a class that is used to create mutable string
        StringBuilder sb = new StringBuilder("Aditya");

        //character at index
        System.out.print(sb.charAt(2));


        //set character at index
        //setCharAt() method replaces the character at the specified index in this string builder with the specified character.
        sb.setCharAt(0, 'K');
        System.out.println(sb);


        //insert() method inserts the given string with this string at the given position.
        sb.insert(5,'a');
        System.out.println(sb);

        //delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
        sb.delete(5,6);
        System.out.println(sb);


        //append() method concatenates the given argument with this string.
        sb.append(" Srivastav");
        System.out.println(sb);

        
        //reverse() method of StringBuilder class reverses the current string.
        sb.reverse();
        System.out.println(sb);

        
    }
}
    