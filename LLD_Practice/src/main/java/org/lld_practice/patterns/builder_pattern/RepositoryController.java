package org.lld_practice.patterns.builder_pattern;

public class RepositoryController {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    private RepositoryController(Builder builder) {
        this.userRepository = builder.userRepository;
        this.productRepository = builder.productRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public static class Builder {
        private UserRepository userRepository;
        private ProductRepository productRepository;

        public Builder withUserRepository(UserRepository userRepository) {
            this.userRepository = userRepository;
            return this;
        }

        public Builder withProductRepository(ProductRepository productRepository) {
            this.productRepository = productRepository;
            return this;
        }

        public RepositoryController build() {
            return new RepositoryController(this);
        }
    }
}
