package List_Collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;	//import collection ArrayList

import com.google.gson.Gson;	//import gson
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Product {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public Product(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceItem, String productName){
    	this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }
    
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public static ArrayList<Product> Data(){
    	    	JsonReader Myreader = null;
    	    	Gson gson = new Gson();
    	    	java.lang.reflect.Type REVIEW = new TypeToken<ArrayList<Product>>(){}.getType();

    	    	    try {
    	    	        Myreader = new JsonReader(new FileReader("barang.json")); //sesuaikan dengan nama file jsonnya
    	    	    } catch (FileNotFoundException e) {
    	    	        e.printStackTrace();
    	    	    }

    	    	    ArrayList<Product> data = gson.fromJson(Myreader,REVIEW); //baca data dengan ArrayList
    	    	    	return data;
    }

}
