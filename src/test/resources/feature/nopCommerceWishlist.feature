Feature: Nop commerce add product to wishlist



  Background:
    Given the user opens the nopcommerce site
    When the user adds the products to wishlist
    Then user see the message "Product successfully added to wishlist"