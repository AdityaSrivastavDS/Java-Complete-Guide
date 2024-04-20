class temperature_conversion{
    public static void main(String args[]){

        //fahrenheit to celsius
        float fahrenheit = 100;
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in celsius is: "+celsius);

        //celsius to fahrenheit
        float celsius1 = 100;
        float fahrenheit1 = (celsius1 * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is: "+fahrenheit1);
    }
}