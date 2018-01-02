
package builder;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    public Product getProduct(){
        return product;
    }

    public  void setPart(String arg1,String arg2){
        product.setName(arg1);
        product.setType(arg2);
    }

}
