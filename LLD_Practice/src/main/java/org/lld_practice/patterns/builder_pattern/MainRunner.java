package org.lld_practice.patterns.builder_pattern;

public class MainRunner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        ProductRepository productRepository = new ProductRepository();

        RepositoryController repositoryController = new RepositoryController.Builder()
                .withUserRepository(userRepository)
                .withProductRepository(productRepository)
                .build();

        System.out.println("UserRepository: " + repositoryController.getUserRepository());
        System.out.println("ProductRepository: " + repositoryController.getProductRepository());
    }
}
