
package builder;

/**
 * TODO
 *
 * @author <a href="mailto:LYJ@zjtachao.com">LYJ</a>
 * @since 2.0
 */
public class Product {

    private String name;
    private String type;

    public void showProduct(){
        System.out.println("名称： "+name);
        System.out.println("型号： "+type);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }

}
