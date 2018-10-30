package lv.javaguru.java2.views;

import lv.javaguru.java2.domain.Product;
import lv.javaguru.java2.services.GetShoppingListService;

public class PrintShoppingListView {
    private GetShoppingListService getShoppingListService;

    public PrintShoppingListView(GetShoppingListService getShoppingListService) {
        this.getShoppingListService = getShoppingListService;
    }
    public  void execute(){
        System.out.println();
        System.out.println("Print shopping list to console execution start!");
        for (Product product : getShoppingListService.getAllProducts()) {
            System.out.println(product.getTitle() + "[" + product.getDescription() + "]");
        }
        System.out.println("Print shopping list to console execution end!");
        System.out.println();
    }
}
