public abstract class RestaurantAbstractFactory {
    
    abstract FastFood getFastFood( String type);
    abstract Drink getDrink( String type);
}