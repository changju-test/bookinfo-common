package orgltmaxcloud.sample.msa.book.common.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    private Long id;
    private Type type;
    private Long bookId;
    private int quantity;

    enum Type {
        PURCHASE, SALE, RENT
    }

    public Order() {}

    public Order(Type type, Long bookId, int quantity) {
        this.type = type;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "Order[id=%d, type='%d', bookId='%d', quantity='%d']",
                id, type, bookId, quantity);
    }

    public Long getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public Long getBookId() {
        return this.bookId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
