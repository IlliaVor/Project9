package Part1;

class Basketball {
    public String brand = "Nike";
    public int size = 7;
    public boolean inflated = true;
    public String place = "outdoor";
    public double price = 40.50;
    //private properties.
    private String color = "Orange";

    //constructor.
    public Basketball() {
        System.out.println("Basketball.");
    }

    private void dribble() {
        System.out.println("Dribbling wasn`t allowed.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class BasketballDemo {
    public static void main(String[] args) {

        Basketball ball1 = new Basketball();


        // ball1.dribble(); // The result will be error

        System.out.println("Brand: " + ball1.brand);
        System.out.println("Size: " + ball1.size);
        System.out.println("Inflated: " + ball1.inflated);
        System.out.println("Place: " + ball1.place);
        System.out.println("Price: $" + ball1.price);


        // System.out.println("Color: " + ball1.color); //The result will be error


        ball1.setColor("Black");
        System.out.println("New Color: " + ball1.getColor());


        Basketball customizedBall = new Basketball();
        customizedBall.setColor("Blue and Red");
        System.out.println("Customized Ball Color: " + customizedBall.getColor());
    }
}




