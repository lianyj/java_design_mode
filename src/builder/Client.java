
package builder;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Client {

    public static void main(String[] args){
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();


        Product product2 = director.getBProduct();
        product2.showProduct();

    }
}
