public class demoGeneric {
    public static void main(String[] args)
    {
        // GenericExample<Double> DGE = new GenericExample<>(5.5);
        // System.out.println(DGE); 
        // GenericExample<Integer> IGE = new GenericExample<>(5);
        // System.out.println(IGE); 
        // GenericExample<String> SGE = new GenericExample<>("Hello");
        // System.out.println(SGE); 

        // GenericRectangle<Integer,Integer> GRec = new GenericRectangle<>(5,5);
        // System.out.println(GRec);
        // GenericRectangle<Integer,Double> GRec2 = new GenericRectangle<>(5,5.5);
        // System.out.println(GRec2);
           GenericRectangle<Double,Double> GRec3 = new GenericRectangle<>(5.5,5.5);
           System.out.println(GRec3);
           GRec3.display(5, 5.5, 5.5);
            
            Circle c1 = new Circle();
            c1.display(5);
            c1.display(5.5);
            c1.display("Hello");




    }
}
