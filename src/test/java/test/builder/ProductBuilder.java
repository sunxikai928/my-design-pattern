package test.builder;

import com.github.sunxikai928.builder.Builder;
import com.github.sunxikai928.builder.Director;
import com.github.sunxikai928.builder.Product1Builder;
import com.github.sunxikai928.builder.Product2Builder;
import org.junit.Test;

/**
 * Created by sunxikai on 18/12/24.
 */
public class ProductBuilder {

    @Test
    public void testProduct1Builder() {
        Builder builder = Product1Builder.newBuilder();
        Director director = new Director(builder);
        director.construct();
    }


    @Test
    public void testProduct2Builder() {
        Builder builder = Product2Builder.newBuilder();
        Director director = new Director(builder);
        director.construct();
    }

}
