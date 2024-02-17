package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.entity.AggregateRoot;
import com.food.ordering.system.valueobject.RestaurantId;

import java.util.List;

public class Restaurant extends AggregateRoot<RestaurantId> {
    private final List<Product> products;
    private boolean actice;

    private Restaurant(Builder builder) {
        super.setId(builder.restaurantId);
        products = builder.products;
        actice = builder.actice;
    }


    public List<Product> getProducts() {
        return products;
    }

    public boolean isActice() {
        return actice;
    }

    public static final class Builder {
        private RestaurantId restaurantId;
        private List<Product> products;
        private boolean actice;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder restaurantId(RestaurantId val) {
            restaurantId = val;
            return this;
        }

        public Builder products(List<Product> val) {
            products = val;
            return this;
        }

        public Builder actice(boolean val) {
            actice = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}
