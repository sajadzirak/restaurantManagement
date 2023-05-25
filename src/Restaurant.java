import java.util.HashMap;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

public class Restaurant{

    public static enum restaurantType{FASTFOOD, IRANIAN, CHINESE, ITALIAN};
    private String name, restaurantAddress;
    private restaurantType restauranType;
    private ObservableList<Food> foodList;
    private HashMap<Food, Integer> foodQuantity;
    private boolean open, takeout;
    private Image restaurantImage;
    private int chairNumber, deliveryNumber;
    // implement score for every restaurnat

    
    public Restaurant(String name, String restaurantAddress, Restaurant.restaurantType restauranType,
            ObservableList<Food> foodList, HashMap<Food, Integer> foodQuantity, boolean open, boolean takeout,
            Image restaurantImage, int chairNumber, int deliveryNumber) {
        this.name = name;
        this.restaurantAddress = restaurantAddress;
        this.restauranType = restauranType;
        this.foodList = foodList;
        this.foodQuantity = foodQuantity;
        this.open = open;
        this.takeout = takeout;
        this.restaurantImage = restaurantImage;
        this.chairNumber = chairNumber;
        this.deliveryNumber = deliveryNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public restaurantType getRestauranType() {
        return restauranType;
    }

    public void setRestauranType(restaurantType restauranType) {
        this.restauranType = restauranType;
    }

    public ObservableList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ObservableList<Food> foodList) {
        this.foodList = foodList;
    }

    public HashMap<Food, Integer> getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(HashMap<Food, Integer> foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isTakeout() {
        return takeout;
    }

    public void setTakeout(boolean takeout) {
        this.takeout = takeout;
    }

    public Image getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(Image restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        if(chairNumber >= 0){
            this.chairNumber = chairNumber;
        }
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        if(deliveryNumber >= 0){
            this.deliveryNumber = deliveryNumber;
        }
    }

    

}