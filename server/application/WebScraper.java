package server.application;

import java.util.HashMap;

public class WebScraper {
    HashMap<String, Command> scraperCommands;

    public void addProduct(String productID, String url, String website, Receiver receiver){
        switch (website) {
            case "Amazon": 
                scraperCommands.put(productID, new AmazonScraperCommand(productID, url, receiver));
                break;
        }
    }

    public void removeProduct(String productID){
        scraperCommands.remove(productID);
    }

    public void scrape(){
        scraperCommands.forEach((k, v) -> v.execute());
    }
}
