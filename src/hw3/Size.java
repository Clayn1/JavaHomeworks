package hw3;

public enum Size {
    XXS(40){
        @Override
        public String getDescription() {
            return "Smallest";
        }
    }, XS(42){
        @Override
        public String getDescription() {
            return "Extra small";
        }
    }, S(44){
        @Override
        public String getDescription() {
            return "Small";
        }
    }, M(46){
        @Override
        public String getDescription() {
            return "Medium";
        }
    }, L(48){
        @Override
        public String getDescription() {
            return "Large";
        }
    };


    private int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }

    public abstract String getDescription();
}
