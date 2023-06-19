public class MenuData implements Comparable<MenuData> {
    private String foodName;
    private String foodNationality;
    private Integer foodPrice;
    private Integer waitTime;

    MenuData(String foodName, String foodNationality, Integer foodPrice, Integer waitTime) {
        this.foodName = foodName;
        this.foodNationality = foodNationality;
        this.foodPrice = foodPrice;
        this.waitTime = waitTime;
    }

    public int compareTo(MenuData anotherMenu) {
        int result = foodNationality.compareTo(anotherMenu.foodNationality);

        if (result == 0) {
            result = foodName.compareTo(anotherMenu.foodName);
        }

        return result;
    }

    public String toString() {
        return    "Food Name: " + foodName
                + " \tNationality: " + foodNationality
                + " \tPrice: $" + foodPrice
                + " \tWait Time: " + waitTime;
    }


}