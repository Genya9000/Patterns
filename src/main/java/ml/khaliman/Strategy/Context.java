package Patterns.Strategy;


    public class Context {
        private Strategy strategy;
        public Context(Strategy strategy) {

            this.strategy = strategy;
        }
        public void contextInterface() {
            strategy.algorithm();
        }
    }

