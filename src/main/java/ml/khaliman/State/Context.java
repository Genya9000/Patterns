package Patterns.State;

public class Context implements State {

        private State state;
        public void setState(State state){
            this.state = state;
        }
        public void doAction() {
            this.state.doAction();
        }
    }

