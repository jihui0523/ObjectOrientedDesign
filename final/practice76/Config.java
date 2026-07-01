class Config {
    private int size;
    private int range;
    private int key;

    public Config(int size, int range, int key) {
        this.size = size;
        this.range = range;
        this.key = key;
    }

    public int getSize() {
        return size;
    }

    public int getRange() {
        return range;
    }

    public int getKey() {
        return key;
    }
}