package Session7;

public interface Product {
    //we can't make fields here because the default of interface class is public static final
    // so we can't change it foe any another instance
    void setName (String name );
    void setColor (String color);
    void setPrice (double price );
    String getName();
    String getColor();
    double getPrice();

    default String getBarcode(){
        return "default Barcode";
    };



}
