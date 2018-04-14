package pl.tomaszKrawczyk.productForm.Model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Tomek Krawczyk on 14.04.2018.
 */
public class ProductForm {


        @NotNull
        @Size(min=2, max=30)
        private String name;

        @NotNull
        @Min(18)
        private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}



