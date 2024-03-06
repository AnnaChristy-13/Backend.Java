package consultations.consultation13.ui;


import consultations.consultation13.dto.ResponseForClientFindAllProducts;
import consultations.consultation13.service.ProductService;

public class FindAllProductMenu implements MenuCommand{

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
