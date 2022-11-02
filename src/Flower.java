public class Flower {
    String name;
    int price;
    String color;

    public void maxPrice(Flower[] array) {
        int maxPrice = array[0].price;
        for (int i = 0; i < array.length; i++) {
            if (maxPrice <= array[i].price) maxPrice = array[i].price;
        }
        System.out.println("maxPrice = " + maxPrice);
    }


    public void separate(Flower[] array) {
        int counterRoz = 0;
        int counterTyl=0;
        for (Flower name : array) {
            if (name.name.equals("Roza")) counterRoz++;
            else counterTyl++;
        }
        Flower[] rozArray = new Flower[counterRoz];
        Flower[] tylArray=new Flower[counterTyl];
        for (int i = 0, j = 0,k=0; i < array.length; i++) {
            if (array[i].name.equals("Roza")){ rozArray[j] = array[i];
                j++;}
            else {tylArray[k]=array[i];k++;}
        }

        for (Flower flower : rozArray) {
            System.out.println("flower.name = " + flower.name);
            System.out.println("flower.price = " + flower.price);
            System.out.println("flower.color = \n" + flower.color);
        }
        System.out.println("-------------------------------------");

        for (Flower flower:tylArray) {
            System.out.println("flower.name = " + flower.name);
            System.out.println("flower.price = " + flower.price);
            System.out.println("flower.color = \n" + flower.color);
        }


    }
}
