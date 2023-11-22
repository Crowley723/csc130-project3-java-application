import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        ArrayList<SearchTerm> searchTerms = new ArrayList<SearchTerm>();
        GetSearchHistory getReq = new GetSearchHistory();

        try{
          getReq.getData(searchTerms);  
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for(SearchTerm term: searchTerms){
            System.out.printf("Search Term: %-20s - Timestamp: %-20s%n", term.searchTerm, term.timestamp);

        }
        
    }
}