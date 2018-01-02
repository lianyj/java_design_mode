
package builder;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart("宝马汽车","X7");
        return builder.getProduct();
    }

    public Product getBProduct(){
        builder.setPart("奥迪汽车","Q5");
        return builder.getProduct();
    }
}
