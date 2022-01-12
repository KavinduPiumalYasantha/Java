abstract class Item{

    private int itemNo;
    private String description;
    private int unitprice;

    public Item(){
        itemNo = 0;
        description = null;
        unitprice = 0;
    }

    public Item(int itemNo, String description, int unitprice ){
        this.itemNo = itemNo;
        this.description = description;
        this.unitprice = unitprice;
    }

    public int getitemNo(){

        return itemNo;
    }

    public void setitemNo(int itemNo)
    {
        this.itemNo = itemNo;
    }

    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description = description;
    }

    public int getunitprice(){
        return unitprice;
    }

    public void setunitprice(int unitprice){
 
        this.unitprice= unitprice;
    }

    public void Display(){

        System.out.println("Item No :" +getitemNo());
        System.out.println("Description :" +getdescription());
        System.out.println("unit Price :" +getunitprice());

    }
    

}    


class Book extends Item{

    private String publisher;
    private String category;
    private int pages;

    public Book(){
        publisher = null;
        category = null;
        pages = 0;
    }

    public Book(int itemNo, String description, int unitprice, String publisher, String category, int pages){

        super(itemNo, description, unitprice);
        this.publisher = publisher;
        this.category = category;
        this.pages = pages;
    }

    public String getpublisher(){
        return publisher;
    }

    public void setpublisher(String publisher){
        this.publisher = publisher;

    }

    public String getcategory(){
        return category;
    }

    public void setcategory(String category){

        this.category = category;
    }

    public int getpages(){
        return pages;
    }

    public void setpages(int pages){
        this.pages = pages;
    }

    public void Display(){

        super.Display();
        System.out.println("Publisher :" +getpublisher());
        System.out.println("Category :" +getcategory());
        System.out.println("Pages : " +getpages());
    }


}

class Car extends Item{
    private String model;
    private String type;


    public Car(){
        model = null;
        type = null;
    }

    public Car(int itemNo, String description, int unitprice, String model, String type){

        super(itemNo,description,unitprice);
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String gettype(){
        return type;
    }

    public void settype(String type){
        this.type = type;
    }

    public void Display(){

        super.Display();
        System.out.println("Model :" +getModel());
        System.out.println("Type :" +gettype());

    }

}    
