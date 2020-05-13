public class App {
    public static void main(String[] args) throws Exception {

        RestaurantFactoryProducer producer = new RestaurantFactoryProducer();
		RestaurantAbstractFactory restaurant1 = producer.getRestaurantAbstractFactory(1);
		RestaurantAbstractFactory restaurant2 = producer.getRestaurantAbstractFactory(2);

        System.out.println(restaurant1.getFastFood("hamburger"));
        System.out.println(restaurant1.getDrink("soda"));
		
        System.out.println(restaurant2.getFastFood("pizza"));
		System.out.println(restaurant2.getDrink("beer"));
		
    }
}
