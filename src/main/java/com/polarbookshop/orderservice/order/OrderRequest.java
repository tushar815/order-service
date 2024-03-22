package com.polarbookshop.orderservice.order;

import jakarta.validation.constraints.*;

public record OrderRequest(
       @NotBlank(message = "The book isbn must be defined.")
        String isbn,

        @NotNull(message = "The book quantity must be defined.")
        @Min(value = 1, message = "You must order at least 1 book")
        @Max(value = 5, message = "You can not order more than 5 books")
        Integer quantity
) {
}
