class User <T> {
    public T id;
    public T card_number;

    public User(T id, T card_number) {
        if (!(id instanceof String | id instanceof Integer | card_number instanceof String | card_number instanceof Integer)) {
            throw new IllegalArgumentException();
        }
        else {
            this.id=id;
            this.card_number = card_number;
        }
    }
}
