public class Arithmetic {
    public static void main(String[] args){
        //number of slices of pizza for each person
        int sliceCountEd=3, sliceCountJan=2, sliceCountMe=2; 
        int cannoliCountEd=2;    // number of cannoli ordered by Ed
        int scoopCountJan=1, scoopCountMe=2;  //# scoops of ice cream for those ordering ice cream
        
        //cost of slice of pizza (‘$’ is part of the variable name)
        double pizzaSlice$=1.75,
        cannoli$=2.25,        //cost of one canonli
        iceCreamScoop$=2;     //cost of one scoop of ice cream
        
        double tipPercent=1.17;
        
        double costEd$ = sliceCountEd*pizzaSlice$ + cannoliCountEd*cannoli$;
        double costJan$ = sliceCountJan*pizzaSlice$ + scoopCountJan*iceCreamScoop$;
        double costMe$ = sliceCountMe*pizzaSlice$ + scoopCountMe*iceCreamScoop$;
        double costTotal$ = (costEd$+costJan$+costMe$)*tipPercent;
        double avg$ = (costEd$+costJan$+costMe$)/3;
        
        System.out.println("Cost of Ed's order: $"+costEd$);
        System.out.println("Cost of Jan's order: $"+costJan$);
        System.out.println("Cost of my order: $"+costMe$);
        System.out.printf("Average cost per person: $%.2f%n", avg$);
        System.out.printf("Total cost: $%.2f\n",costTotal$);
        System.out.println("Total paid: $"+Math.ceil(costTotal$));
    }
}