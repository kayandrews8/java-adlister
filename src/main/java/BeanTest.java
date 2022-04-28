import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Quote> quotes = new ArrayList<>();
        Author marcel = new Author(1L, "Marcel Proust");
        Author neil = new Author(2L, "Neil Gaiman");


        Quote quote1 =new Quote (1L,"My destination is no longer a place, rather a new way of seeing.", marcel);
        Quote quote2 = new Quote(2L,"Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.",neil);

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor().getAuthorName() + " once said: " + quote.getContent());
        }

    }
}
