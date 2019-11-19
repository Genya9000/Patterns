package ml.khaliman.Command;
class CarInvoker {
    public Command command;
    public CarInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}

