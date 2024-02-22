
/**
 * Flower Management System.
 *
 * Programmer : Adam Syafi
 * Date : 22 February 2024
 */

//Class definition
public class Flower
{
    //Declaration of the attributes
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    //contructor without parameter
    public Flower()
    {
        this.name = name;
        this.color = color;
        this.price = 0;
        this.quantity = 0;
    }
    
    //contructor with parameter
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    //accessor method
    public String getName() 
    {
        return name;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    //mutators method
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    //toStirng method
    public String toSring()
    {
        return "name=" + name + "\nColor=" + color + "\nPrice=" + price + "\nQuantity=" + quantity;
        
    }
}
