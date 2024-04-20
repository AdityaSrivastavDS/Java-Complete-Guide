//Find the number of ways in which you can invite n people to your party, single ior in pairs

class invite_guests {
    public static int invitePeople(int n){
        //base case
        //when we have one or less than one people to invite 
        if(n <= 1){
            return 1;
        }
        //inviting as single
        int inviteSingle = invitePeople(n-1);

        //invite in pair
        int invitePair = (n-1)*invitePeople((n-2));

        //total no. of ways to invite 
        return inviteSingle + invitePair;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println("Total no. of ways to invite people: "+invitePeople(n));
    }
}
